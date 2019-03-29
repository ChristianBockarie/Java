package myownpractice;

import java.util.Scanner;

public class DaysOfTheWeek {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] Day = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		
		for (int a = 1; a <= 7; a++) {
			System.out.println("Please enter day " + a + " of the week");
		}
		for (String i : Day) {
			System.out.println(i);
		}

	}
}