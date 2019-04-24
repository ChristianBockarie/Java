package myownpractice;

public class Car {
	public static String make="Toyota";
	 public static String model="Prius";
	 public static int numberOfDoors=4;
	 int topSpeed;
	 double price;

	public Car(String make, String model, int numberOfDoors, int topSpeed, double price){
	  make=make;
	  model=model;
	  numberOfDoors=numberOfDoors;
	  topSpeed=120;
	  price=30000.0;
	}
	public Car(String make, String model, int topSpeed, double price){
	  make=make;
	  model=model;
	  numberOfDoors=numberOfDoors;
	  topSpeed=topSpeed;
	  price=price;
	}
	public Car(int numberOfDoors, int topSpeed, double price){
	  make="unknown";
	  model="unknown";
	  numberOfDoors=numberOfDoors;
	  topSpeed=topSpeed;
	  price=price;
	}
	public Car(String make, String model, int numberOfDoors){
	  make=make;
	  model=model;
	  numberOfDoors=numberOfDoors;
	}
	public void getCarDetails(){
	  //String details = make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price;
	 // System.out.println(details);
	  System.out.println();
	}
	public static void main(String[] args) 
	{
		Car obj1 = new Car("Toyota", "Prius", 4, 120, 30000.0);
		obj1.getCarDetails();
		Car obj2 = new Car("Toyota", "Prius", 4, 120, 30000.0);
		obj2.getCarDetails();
		Car obj3 = new Car("unknown", "unknown", 4, 120, 30000.0);
		obj3.getCarDetails();
		Car obj4 = new Car("Toyota", "Prius", 4, 90, 0.0);
		obj4.getCarDetails();
		
	}
}
