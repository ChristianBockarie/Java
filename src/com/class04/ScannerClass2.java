package com.Class04;

import java.util.Scanner;

public class ScannerClass2 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please enter any number");
		int myNumber = input.nextInt();

		System.out.println("The number you entered is " + myNumber);

	}
}
