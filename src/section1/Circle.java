package section1;

public class Circle extends Shape {
    int radius;

    public Circle(String shapeName, int radius) {
        super(shapeName);
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14*radius*radius;

    }
}
