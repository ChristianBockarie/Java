package com.Class5;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*Write a program to find largest of three double values using 
		 * if-else...if provided by a user(numbers must be distinct)
		 */
		
		Scanner input = new Scanner(System.in);
		
		
		double num1, num2, num3;
		
		System.out.println("Enter num1");
		num1 = input.nextDouble();
		
		System.out.println("Enter num2");
		num2 = input.nextDouble();
		
		System.out.println("Enter num3");
		num3 = input.nextDouble();
		
		if (num1 >= num2 && num1 >=num3) {
			System.out.println(num1+ " is the largest Number");
			
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2+ " is the largest Number");

		}else {
			System.out.println(num3+ " is the largest Number");
			
		}
	}

}
