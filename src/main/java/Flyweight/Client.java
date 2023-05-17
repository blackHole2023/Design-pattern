package Flyweight;

import java.util.HashMap;
import java.util.Map;

// 抽象享元类

/**
 * Flyweight是抽象享元类，ConcreteFlyweight是具体享元类，FlyweightFactory是享元工厂类。客户端通过享元工厂获取享元对象，并进行操作。
 *
 * 与未实现享元模式的对比：
 *
 * 如果没有使用享元模式，每次需要创建相同的内部状态时都会创建新的对象，导致资源的浪费。而使用享元模式，可以在享元工厂中缓存已经创建的享元对象
 * ，当需要相同内部状态的对象时，直接从缓存中获取，避免了重复创建。这样可以减少内存占用和对象创建的开销。
 *
 * 在示例代码中，通过享元工厂类 FlyweightFactory 实现了享元对象的缓存和共享。当客户端需要相同内部状态的享元对象时，不会重复创建，
 * 而是直接返回缓存中的对象，实现了对象的共享。这样可以节省内存，并提高系统的性能。
 */
interface Flyweight {
    void operation();
}

// 具体享元类
class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation() {
        System.out.println("具体享元类操作，内部状态为：" + intrinsicState);
    }
}

// 享元工厂类
class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }
}

// 客户端
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("A");
        flyweight1.operation();  // 具体享元类操作，内部状态为：A

        Flyweight flyweight2 = factory.getFlyweight("B");
        flyweight2.operation();  // 具体享元类操作，内部状态为：B

        Flyweight flyweight3 = factory.getFlyweight("A");
        flyweight3.operation();  // 具体享元类操作，内部状态为：A

        System.out.println(flyweight1 == flyweight3);  // true，同一对象
    }
}
