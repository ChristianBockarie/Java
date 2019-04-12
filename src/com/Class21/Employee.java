package com.Class21;

public class Employee {
	
	String eID;
	int Salary;
	public static String CEO = "Sumair";

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		// obj 1
		emp1.eID = "Christian";
		emp1.Salary = 80000;
		emp1.display();

		// obj 2
		emp2.eID = "Anil";
		emp2.Salary = 70000;
		emp2.display();
	}

	public void display() {
		System.out.println(eID + " is getting paid " + Salary + " and his CEO is " + CEO);
	}
}
