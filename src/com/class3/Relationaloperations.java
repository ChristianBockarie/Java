package com.class3;

public class Relationaloperations {

	public static void main(String[] args) {
		int a=198;
		int b=198;
		boolean result=a>b;
		boolean result1= a==b;
		
		System.out.println(result);
		System.out.println(result1);
		
		//compare 2 numbers and if a is larger than  b----> print
		if (a!=b) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
			
		}
		//declare price and if price is higher than expected price---> I will not buy it 
		double shoesPrice=32.99;
		double allowedPrice=31.99;
		if (shoesPrice<=allowedPrice) {
			System.out.println("I am buying those shoes");
		}else {
			System.out.println("I am NOT buying those shoes");
		}
		System.out.println("I am continues code");
		System.out.println("I am continues code");

	}

}
