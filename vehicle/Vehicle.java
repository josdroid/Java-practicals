import java.util.*;
class Car extends Vehicle{
  Scanner sc= new Scanner(System.in);
  void startEngine() {
    System.out.println("Start Car");   
  }
  public Car(String vehicleNumber,String brand){
      super(vehicleNumber,brand);
  }
}
class Bike extends Vehicle{
   public Bike(String vehicleNumber,String brand){
      super(vehicleNumber,brand);
  }
  Scanner sc= new Scanner(System.in);
  void startEngine() {
    System.out.println("Start Bike");   
  }  
}
abstract class Vehicle{
    abstract void startEngine();

    String vehicleNumber;
    String brand;

    public Vehicle(String vehicleNumber, String brand){
      this.vehicleNumber=vehicleNumber;
      this.brand=brand;
    }
    final void showVehicleIdentity(){
      System.out.println("The Vehicle number is: "+ vehicleNumber);
      System.out.println("The Vehicle brand is: "+ brand);
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Vehicle v;

    System.out.println("Enter 1 for Car and 2 for Bike");
    int choice=sc.nextInt();
    System.out.println("Enter the number of Vehicle:");
    String vehicleNumber=sc.next();
    System.out.println("Enter the brand of Vehicle:");
    String brand=sc.next();

    if(choice==1){
      v=new Car(vehicleNumber,brand);
      v.showVehicleIdentity();
      v.startEngine();
      
    }
    else if(choice==2){
      v=new Bike(vehicleNumber,brand);
      v.showVehicleIdentity();
      v.startEngine();
    }
    else{
      System.out.println("Invalid Input");
    }
    sc.close();
  }
}




