package abstractFactory;

@SuppressWarnings("all")
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory1 = new RectangleFactory();
        Shape shape1 = factory1.createShape();
        Color color1 = factory1.createColor();
        shape1.draw();
        color1.fill();

        AbstractFactory factory2 = new CircleFactory();
        Shape shape2 = factory2.createShape();
        Color color2 = factory2.createColor();
        shape2.draw();
        color2.fill();
    }
}
