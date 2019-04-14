package com.Class23;

public class AdditonInPolymorphism {

	//1.overloading methods by changing number of parameters
	public void add(int a, int b) {
		System.out.println("Method to add 2 integers");
		System.out.println(a+b);
	}
	public void add(int a) {
		System.out.println("Method to add 1 integer");
		System.out.println(a+100);
	}
	public void add(int a, int b, int c) {
		System.out.println("Method to add 3 integer");
		System.out.println(a+b+c);
	}
	//2.overloading method by changing the data type of the parameters
	public void add(double a, double b) {
		System.out.println("Method to add 2 double");
		System.out.println(a+b);
	}
	public void add(int a, double b) {
		System.out.println("Method to add 1 integer and 1 double");
		System.out.println(a+b);
	}
	public void add(double a, int b) {
		System.out.println("Method to add 1 double and 1 Integer");
		System.out.println(a+b);
	}
	public void add(double a, double b, double c) {
		System.out.println("Method to add 3 double");
		System.out.println(a+b+c);
	}
}
