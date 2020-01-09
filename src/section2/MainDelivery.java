package section2;

import java.util.Scanner;

public class MainDelivery {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String bowler = null, batsman = null;
        long runs = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu " + "\n" + "1.Player details of the delivery " + "\n"
                + "2.Run details of the delivery ");
        int choice = sc.nextInt();
        sc.nextLine();
        Delivery delivery = new Delivery();
        if (choice == 1) {
            System.out.println("Enter the bowler name ");
            bowler = sc.nextLine();

            System.out.println("Enter the batsman name ");
            batsman = sc.nextLine();
            String[] lnameBowler = bowler.split(" ");
            String[] lnameBatsman = batsman.split(" ");
            int length = lnameBowler.length;
            int length1 = lnameBatsman.length;
            delivery.displayDeliveryDetails(lnameBowler[length - 1], lnameBatsman[length1 - 1]);
        }
        if (choice == 2) {
            System.out.println("Enter the number of runs ");
            runs = sc.nextLong();
            delivery.displayDeliveryDetails(runs);
        }

        sc.close();

    }

}
