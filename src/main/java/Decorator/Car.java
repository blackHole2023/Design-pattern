package Decorator;

/**
 * 装饰器模式是一种结构型设计模式，它允许你通过将对象放入包含行为的特殊封装对象中来为原对象添加新的行为。
 * 具体实现上，装饰器模式通常涉及创建一个抽象的装饰器类，该类与被装饰对象实现相同的接口，并维护一个指向被装饰对象的引用。
 * 装饰器类中包含一个装饰方法，用于向被装饰对象添加额外的行为。
 */
public interface Car {
    int getPrice();
}


class Audi implements Car {
    private int price = 200000;

    @Override
    public int getPrice() {
        return price;
    }
}

abstract class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public int getPrice() {
        return car.getPrice();
    }
}

class LeatherSeatDecorator extends CarDecorator {
    public LeatherSeatDecorator(Car car) {
        super(car);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5000;
    }
}

class NavigationSystemDecorator extends CarDecorator {
    public NavigationSystemDecorator(Car car) {
        super(car);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10000;
    }
}

class Main{
    public static void main(String[] args) {
        // 使用
        Car audi = new Audi();
        audi = new LeatherSeatDecorator(audi);
        audi = new NavigationSystemDecorator(audi);
        int price = audi.getPrice(); // 215000
        System.out.println(price);
    }
}