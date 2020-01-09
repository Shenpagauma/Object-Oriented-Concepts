package section2;

import java.util.Scanner;


import section1.Circle;
import section1.Rectangle;
import section1.Square;

public class MainArea {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.Rectangle\n2.Square\n3.Circle\n4.Hexagon");
        System.out.println("Area Calculator --- Choose Your shape\n");
        int choice=input.nextInt();
        switch(choice) {
        case 1:
           System.out.println("Enter length and breadth");
            int length=input.nextInt();
            int breadth=input.nextInt();     
            Rectangle rectangle=new Rectangle("Rectangle",length, breadth);
           System.out.printf("Area of Rectangle :%.2f",rectangle.calculateArea());
            break;
        case 2:
            System.out.println("Enter side");
            int side=input.nextInt();
            Square square=new Square("Square",side);
          System.out.printf("Area of Square : %.2f",square.calculateArea());
            
            break;
        case 3:
            System.out.println("Enter Radius");
            int radius=input.nextInt();
            Circle circle=new Circle("Circle",radius);
         System.out.printf("Area of Circle :%.2f",circle.calculateArea());
            break;
        case 4:
            System.out.println("Enter Side");
            Integer side1=input.nextInt();
            Hexagon hex=new Hexagon("Hexagon",side1);
         System.out.printf("Area of Hexagon is %.2f",hex.calculateArea());
            break;
        }
        input.close();


    }

}
