package com.Class10;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		/*
		 * Ask a user to input a leap year. Give the user 10 chances to enter a correct
		 * leap year. As soon as the user enters the correct leap year exit the loop
		 */

		/*
		 * The year can be evenly divided by 4; If the year can be evenly divided by
		 * 100, it is NOT a leap year, unless; The year is also evenly divisible by 400.
		 * Then it is a leap year.
		 */

		//

		Scanner input = new Scanner(System.in);
		int year;
		System.out.println("Please enter a guessed leap year");

		for (int i = 0; i < 10; i++) {
			year = input.nextInt();
			//isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
				if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
					System.out.println("Year is a leap year");
				break;
			} else if (!(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
				System.out.println("This year is not a valid leap year");
				System.out.println("Please enter a valid leap year");
			}
		}
		System.out.println("Out of Chances");	
	}
}