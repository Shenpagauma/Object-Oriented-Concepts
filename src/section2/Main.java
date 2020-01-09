package section2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the Card\n1.Payback\n2.Membership");
        int choice = input.nextInt();
        input.nextLine();
        if (choice == 1) {
            System.out.println("Enter the Card details");
            String cardDetails[] = input.nextLine().split("\\|");
            System.out.println("Enter points in card");
            Integer pointsEarned = input.nextInt();
            System.out.println("Enter Amount");
            Double totalAmount = input.nextDouble();
            PayBackCard payBack = new PayBackCard(cardDetails[0], cardDetails[1], cardDetails[2],
                    pointsEarned, totalAmount);
            payBack.display();
        }
        if (choice == 2) {
            System.out.println("Enter the Card details");
            String cardDetails[] = input.nextLine().split("\\|");
            System.out.println("Enter rating in card\n");
            Integer rating = input.nextInt();
            MembershipCard member = new MembershipCard(cardDetails[0], cardDetails[1],
                    cardDetails[2], rating);
            member.display();
        }
        input.close();

    }

}
