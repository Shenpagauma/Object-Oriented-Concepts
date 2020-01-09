package section1;

import java.util.Scanner;

public class AreaShape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Rectangle\n2.Square\n3.Circle");
        System.out.println("Area Calculator --- Choose Your shape\n");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            System.out.println("Enter length and breadth\n");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            Rectangle rectangle = new Rectangle("Rectangle", length, breadth);
            System.out.printf("%.2f", rectangle.calculateArea());
            break;
        case 2:
            System.out.println("Enter side\n");
            int side = sc.nextInt();
            Square square = new Square("square", side);
            System.out.printf("%.2f", square.calculateArea());

            break;
        case 3:
            System.out.println("Enter Radius\n");
            int radius = sc.nextInt();
            Circle circle = new Circle("Circle", radius);
            System.out.printf("%.2f", circle.calculateArea());
            break;
        }
        sc.close();

    }

}
