package bridge.withoutBridge;

public class Circle {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing circle with color " + color);
    }
}

class Square {
    private String color;

    public Square(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing square with color " + color);
    }
}
class Main{
    public static void main(String[] args) {
        // 没有使用桥接模式，难以维护，类太多，桥接模式主要是利用了接口和多态
        Circle redCircle = new Circle("red");
        redCircle.draw();
        Square blueSquare = new Square("blue");
        blueSquare.draw();
    }
}

