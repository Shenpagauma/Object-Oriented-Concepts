package section1;

import java.util.Scanner;

public class AccountTransactions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        String accountNumber = input.next();
        System.out.println("Enter the Account Balance");
        int balance = input.nextInt();
        System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
        int choice = input.nextInt();
        Account account = new Account(accountNumber, balance);
        if (choice == 1) {
            System.out.println("Enter the amount to deposit ");
            int deposit = input.nextInt();
            account.deposit(deposit);
            /* acc.setAccountNumber(accountNumber); */
        }
        if (choice == 2) {
            System.out.println("Enter the amount to withdraw ");
            int withdraw = input.nextInt();
            account.withdraw(withdraw);
            /* acc.setAccountNumber(accountNumber); */
        }
        input.close();

    }

}
