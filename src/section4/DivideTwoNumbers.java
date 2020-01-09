package section4;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 2 numbers\n");
        int a = input.nextInt();
        int b = input.nextInt();
        try {
            if (b == 0) {
                throw new DivideByZeroException();
            } else {
                int c = a / b;
                System.out.println("The quotient of " + a + "/ " + b + " = " + c);
            }

        } catch (DivideByZeroException exp) {
            // exp.printStackTrace();
            System.out.println(exp);
        } finally {
            System.out.println("Inside finally block");
            input.close();
        }

    }

}
