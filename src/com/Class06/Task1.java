package com.Class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it
		 * once values are captured, print which language user speaks
		 */

		Scanner input;
		String country;
		String language;
		
		input = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = input.next();
		
		switch (country) {
		
		case "China":
			language = "Chinese";
			break;
			
		case "USA":
			language = "English";
			break;
			
		case "Jamaica":
			language = "Patio";
			break;
			
		default:
			language = "Please enter a country";
		}
		System.out.println("The language you speak is "+language);
	}

}
