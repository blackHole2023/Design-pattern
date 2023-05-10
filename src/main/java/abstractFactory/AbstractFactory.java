package abstractFactory;

/**
 * 比工厂方法更加的抽象，之定义了两个方法
 */
interface AbstractFactory {
    public Shape createShape();
    public Color createColor();
}

class RectangleFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }

    @Override
    public Color createColor() {
        return new RedColor();
    }
}

class CircleFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new BlueColor();
    }
}

interface Shape {
    public void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

interface Color {
    public void fill();
}

class RedColor implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with red");
    }
}

class BlueColor implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with blue");
    }
}