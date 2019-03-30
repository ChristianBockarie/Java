package com.Class13;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Create a string and if the string is not empty perform the following: if the
		 * string has an odd number of characters and has 3 or more characters, print
		 */

		String day1 = new String("Empty!");
		if (day1.isEmpty()) {
			if (day1.length() % 2 != 0 && day1.length() > 3) {

				System.out.println(day1.charAt(day1.length() / 2));
			}
		}
	}

}
