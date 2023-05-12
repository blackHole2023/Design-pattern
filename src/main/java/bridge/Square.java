package bridge;

public class Square implements Shape {
    private Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square with color " + color.fill());
    }
}