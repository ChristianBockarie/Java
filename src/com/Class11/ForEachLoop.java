package com.Class11;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] numbers = { 12, 13, 14, 15, 16, 17 };

		for (int monkey : numbers) {
			System.out.println(monkey + " ");
		}

		/*
		 * Task 1 Create an array of cars And store 6 elements into it using 2 different
		 * loops print all values from the array
		 */
		System.out.println("-----Names of 6 cars-------");
		String[] cars = { "Volvo", "BMW", "Dodge", "Honda", "Ford", "Chevy" };

		for (String car : cars) {
			System.out.println(car);
		}

		System.out.println("----------------");
		/*
		 * Task 2 Create an array of countries. While retrieving all values form an
		 * array, print capital for each country
		 */
		System.out.println("-----array of Countries------");
		String[] countries = { "USA", "China", "Nigeria", "Britain" };
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("USA")) {
				System.out.println(countries[i] + " Washington DC");
			} else if (countries[i].equals("China")) {
				System.out.println(countries[i] + " Shangai");
			} else if (countries[i].equals("Nigeria")) {
				System.out.println(countries[i] + " Lagos");
			} else if (countries[i].equals("Britain")) {
				System.out.println(countries[i] + " London");
			}

		}
		System.out.println("----------------");

		String[] country = { "USA", "China", "Nigeria", "Britain" };
		for (String names : country) {

			switch (names) {
			case "USA":
				System.out.println("Washington DC");
				break;
			case "China":
				System.out.println("Shangai");
				break;
			case "Nigeria":
				System.out.println("Lagos");
				break;
			case "Britain":
				System.out.println("London");
				break;
			}
		}
		System.out.println("----------------");

		/*
		 * Task 3 Create an array on integers And calculate the sum of all elements in
		 * the array
		 */

		int[] sumOfNumbers = { 2, 4, 6, 8, };
		int sum = 0;

		for (int i = 0; i < sumOfNumbers.length; i++) {
			// sum = sum + sumOfNumbers[i];

			sum += sumOfNumbers[i];
			
			System.out.println(sum);
		}

	}
}