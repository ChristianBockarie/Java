package com.class7;

public class DoWhile {

	public static void main(String[] args) {

		// DO
		// execute first and then check condition
		// will print at least once

		int a = 10;

		do {
			System.out.println("Hello");
			a++;

		} while (a > 15);


		// WHILE
		// check condition and then execute

		int b = 10;
		while (b < 15) {
			System.out.println("Bye");
			b++;
		}

	}

}
