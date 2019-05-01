package com.class04;

import java.util.Scanner;

public class ScannerAndIf {
	private static Scanner scanner=new Scanner(System.in);
	/*
	 * take 2 number from a user and compare those numbers
	 */
	public static void main(String[] args) {
		
		
		int num1, num2;
		
		System.out.println("Please enter first number");
		num1=scanner.nextInt();
		
		System.out.println("Please enter second number");
		num2=scanner.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		
	}
}
