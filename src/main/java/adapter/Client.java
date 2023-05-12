package adapter;


/**
 * 适配器模式的主要作用是将一个类的接口转换成客户端所期望的另一种接口，从而使原本不兼容的类能够协同工作。
 * 适配器模式可以用来重用已有的类，而不需要对其进行修改，从而实现系统的灵活性和可扩展性。
 * 与未实现适配器模式的代码相比，适配器模式的代码具有更好的可读性、可维护性和可扩展性。
 */

// 目标接口
interface Target {
    void request();
}

// 源接口
interface Adaptee {
    void specificRequest();
}

// 源接口的实现类
class ConcreteAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("调用源接口的具体实现方法。");
    }
}

// 适配器
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

// 客户端
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new ConcreteAdaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
