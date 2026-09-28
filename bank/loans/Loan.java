package loans;

public class Loan {

    int loanNumber;
    String loanType;
    int loanAmount;

    public Loan(int loanNumber, String loanType, int loanAmount) {
        this.loanNumber = loanNumber;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public void displayLoanDetails() {
        System.out.println("Loan Number: " + loanNumber);
        System.out.println("Loan Type: " + loanType);
        System.out.println("Loan Amount: Rs. " + loanAmount);
    }
}