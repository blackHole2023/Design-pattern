package bridge;

/**
 * 使用接口 Shape 来表示形状，使用接口 Color 来表示颜色。每个形状都有一个颜色对象，形状的 draw() 方法会调用颜色对象的 fill() 方法来填充颜色。
 * 这样做的好处是，我们可以轻松地添加新的形状或颜色，不会导致类爆炸，也更容易维护和扩展。
 */
public class Main {
    public static void main(String[] args) {
        // 使用
        Shape redCircle = new Circle(new Red());
        redCircle.draw();
        Shape blueSquare = new Square(new Blue());
        blueSquare.draw();
        Shape yellowCircle = new Circle(new Yellow());
        yellowCircle.draw();
    }
}
