package com.Class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*Write a program to find largest number among three numbers 
		 * using nested if provided by a user (numbers must be distinct)
		 */

		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Enter num1");
		num1 = input.nextInt();
		
		System.out.println("Enter num2");
		num2 = input.nextInt();
		
		System.out.println("Enter num3");
		num3 = input.nextInt();
		
		
		if (num1 > num2) {
			if (num1 > num3) 
			System.out.println(num1+ " is the largest number");	
			else 
			System.out.println(num3+ " is the largest number");
			
		}else {
			if (num2 > num3) 
			System.out.println(num2+ " is the largest number");
			else {
			System.out.println(num3+ " is largest");
		}
			
	}

	}
}
