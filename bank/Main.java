import customers.Customer;
import loans.Loan;
import accounts.Account;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static Customer initCustomer(int customerId, String customerName, int contactNumber) {
        return new Customer(customerId, customerName, contactNumber);
    }
    static Account initAccount(int accountNumber, String accountType, int balance) {
        return new Account(accountNumber, accountType, balance);
    }
    static Loan initLoan(int loanNumber, String loanType, int loanAmount) {
        return new Loan(loanNumber, loanType, loanAmount);
    }
    public static void main(String[] args) {
        int choice = 1;
        Account a1 = null;
        Loan l1 = null;
        Customer c1 = null;

        while (choice != 0) {
            System.out.println("*********************************");
            System.out.println("1. Customer");
            System.out.println("2. Accounts");
            System.out.println("3. Loans");
            System.out.println("0. Exit");
            System.out.println("*********************************");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("*********************************");

            switch (choice) {

                case 1:

                    System.out.println("Enter the Customer ID:");
                    int customerId = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter the Customer Name:");
                    String customerName = sc.nextLine();

                    System.out.println("Enter the Customer Contact Number:");
                    int contactNumber = sc.nextInt();

                    c1 = initCustomer(customerId, customerName, contactNumber);

                    c1.displayCustomerDetails();

                    break;

                case 2:

                    System.out.println("Enter the Account Number:");
                    int accountNumber = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter the Account Type:");
                    String accountType = sc.nextLine();

                    System.out.println("Enter the Account Balance:");
                    int balance = sc.nextInt();

                    a1 = initAccount(accountNumber, accountType, balance);

                    a1.displayAccountDetails();

                    break;

                case 3:

                    System.out.println("Enter the Loan Number:");
                    int loanNumber = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter the Loan Type:");
                    String loanType = sc.nextLine();

                    System.out.println("Enter the Loan Amount:");
                    int loanAmount = sc.nextInt();

                    l1 = initLoan(loanNumber, loanType, loanAmount);

                    l1.displayLoanDetails();

                    break;

                case 0:

                    System.out.println("Thank you");
                    break;

                default:

                    System.out.println("Invalid Choice");
                    break;
            }
        }

        sc.close();
    }
}