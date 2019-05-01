package com.Class06;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/*
		 * Prompt user to enter their country Based on the country, ---->specify
		 * favorite food
		 */

		Scanner input;
		String country;
		String favoriteFood;

		input = new Scanner(System.in);
		System.out.println("Please enter your Country");
		country = input.nextLine();

		switch (country) {

		case "Sierra Leone":
			favoriteFood = "Rice";
			break;
			
		case "USA":
			favoriteFood = "Burger";
			break;
			
		default:
			favoriteFood = "Unknown";
			

		}
		System.out.println("Your favorite food is "+favoriteFood);
	}

}
