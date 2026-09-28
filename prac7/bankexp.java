import java.util.*;
class InsufficientBalance extends Exception{
  InsufficientBalance(String message){
    super(message);
  }
}
class Account{
  String accountHolderName;
  double accountBalance;

  Account(String accountHolderName,double accountBalance){
    this.accountHolderName=accountHolderName;
    this.accountBalance=accountBalance;
  }
  void withdrawal(double withdrawalAmount) throws InsufficientBalance {
    if(withdrawalAmount>accountBalance){
      
      throw new InsufficientBalance("Insufficient Balance");
      
    }
    else{
      accountBalance-=withdrawalAmount;
      System.out.println("Withdrawal Successful");
    }
  }
  void displayAccountDetails(){
    System.out.println("Account Holder Name: "+accountHolderName);
    System.out.println("Account Balance: Rs. "+accountBalance);
  }
}
public class bankexp{
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Account Holder Name: ");
    String accountHolderName=sc.nextLine();
    System.out.println("Enter Account Balance: ");
    double accountBalance=sc.nextDouble();
    Account account=new Account(accountHolderName,accountBalance);
    account.displayAccountDetails();
    System.out.println("Enter Withdrawal Amount: ");
    try{
      double withdrawalAmount=sc.nextDouble();
      account.withdrawal(withdrawalAmount);
    }
    catch(InsufficientBalance e){
      System.out.println(e.getMessage());
    }
    account.displayAccountDetails();    
  }
}