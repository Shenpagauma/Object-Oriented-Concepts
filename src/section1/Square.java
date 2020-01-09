package section1;

public class Square extends Shape {
    int side;
    public Square(String shapeName,int side) {
      super(shapeName);
      this.side = side;
    } 

    public double calculateArea() {
        return this.side*this.side;
    }
}