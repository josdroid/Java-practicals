package customers;

import java.util.Scanner;

public class Customer {

    int customerID;
    String customerName;
    int contactNumber;

    public Customer(int customerID, String customerName, int contactNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
    }

    public void initializeCustomerDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Customer ID:");
        this.customerID = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the Customer Name:");
        this.customerName = sc.nextLine();

        System.out.println("Enter the Customer Contact:");
        this.contactNumber = sc.nextInt();
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Contact Number: " + contactNumber);
    }
}