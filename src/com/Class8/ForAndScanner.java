package com.Class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		
		/*Prompt user to enter 2 integers and compare
		 * At the end print largest
		 */
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		int largest = 0;
		
		for (int i=1; i<=5; i++) {
		System.out.println("Please enter 2 numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if (num1>num2) {
			largest = num1;
		}else if (num2>num1) {
			largest = num2;
		}else {
			System.out.println(num1 + " is equal to " + num2);
		}
		System.out.println(largest + "is the largest");
		
		

	}

}
}