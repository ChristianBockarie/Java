package com.Class07;

import java.util.Scanner;

public class HomeWorkTask {

	public static void main(String[] args) {
		/*Ask user to pay for a soda
		 * keep asking user to pay for soda until entered price is equal to 1.99
		 * after user got a right amount print "Please enjoy your soda"
		 */

		Scanner input;
		boolean userInput = true;
		double price=1.99;
		input = new Scanner(System.in);
		
		while (userInput) {
			System.out.println("Pay for soda");
			price = input.nextDouble();
			
			
			if (price==1.99) {
				userInput = false;
				System.out.println("Please enjoy your soda");
			}price++;
		
	}
	}
}
