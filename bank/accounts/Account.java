package accounts;

public class Account {

    int accountNumber;
    String accountType;
    int balance;

    public Account(int accountNumber, String accountType, int balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(int depositAmount) {

        if (depositAmount <= 0) {
            System.out.println("The deposit amount has to be valid.");
            return;
        }

        balance = balance + depositAmount;

        System.out.println("Rs. " + depositAmount + " was deposited.");
        System.out.println("Current Balance: Rs. " + balance);
    }

    public void withdraw(int withdrawAmount) {

        if (withdrawAmount <= 0) {
            System.out.println("The withdrawal amount is invalid.");
            return;
        }

        if (withdrawAmount > balance) {
            System.out.println("Withdrawal cannot be more than balance.");
            return;
        }

        balance = balance - withdrawAmount;

        System.out.println("Rs. " + withdrawAmount + " was withdrawn from balance.");
        System.out.println("Current Balance: Rs. " + balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: Rs. " + balance);
    }
}