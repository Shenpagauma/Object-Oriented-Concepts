package section1;

public class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    /*
     * public void setAccountNumber(String accountNumber) { this.accountNumber =
     * accountNumber; }
     */

    public int getBalance() {
        return balance;
    }

    public void deposit(int deposit) {
        this.balance = this.balance + deposit;
        System.out.println("Your balance after the transaction is: " + getBalance());
    }

    public void withdraw(int transactionAmount) {
        if (transactionAmount > this.balance) {
            System.out.println("Insufficient Balance \n" + "\n"
                    + "Your balance after the transaction is: " + getBalance());

        } else {
            this.balance = this.balance - transactionAmount;
            System.out.println("Your balance after the transaction is: " + getBalance());
        }

    }

}
