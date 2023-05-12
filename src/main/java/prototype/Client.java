package prototype;

/**
 * 可以看出，使用原型模式可以让我们避免手动复制对象的状态，而是让对象自己实现克隆方法来创建新对象。
 * 这样的好处在于，我们只需要关注对象本身的克隆方法实现，而不用考虑具体的状态复制方式。
 * 同时，原型模式也可以让我们避免对象创建时可能带来的性能损失，因为原型模式只需要在创建原型对象时进行一次复制，
 * 之后的对象创建可以直接克隆原型对象而不需要再次进行初始化。
 */
// 原型接口
interface Prototype {
    Prototype clone();
}

// 具体原型类
class ConcretePrototype implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype();
    }
}

// 客户端代码
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        Prototype clonedPrototype = prototype.clone();
        System.out.println(clonedPrototype.getClass().getSimpleName()); // 输出：ConcretePrototype
    }
}
