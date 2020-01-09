package section1;

public class Rectangle extends Shape {

 
    int length;
    int breadth;
    

    public Rectangle(String shapeName ,double length2, double breadth2) {
        super(shapeName);
        this.length = (int) length2;
        this.breadth = (int) breadth2;
    }

    public double calculateArea() {
        return this.length * this.breadth;
    }
}
