package com.Class23;

public class Employee {
	
	public static String department = "IT";
	
	//testing for default and protected instance variable
	int salary;//default
	protected int salary1;//protected
	
	public void getPaid() {
		System.out.println("Employees get Paid " + salary);
	}
	public static void work() {
		System.out.println("Employees work in " +department+ " department");
	}
	
	//Testing for protected and default method
	protected void test() {
		System.out.println("I am a protected method");
	}
	void test1() {
		System.out.println("I am a default method");
	}
}
