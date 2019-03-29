package com.class7;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean result;
		int score;
		String eligibility;

		System.out.println("Do you need a loan?");
		result = input.nextBoolean();

		if (result) {
			System.out.println("What is your credit score?");
			score = input.nextInt();
			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score >= 701 && score <= 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}

		} else {
			eligibility = "unknown";
		}
		System.out.println("The eligibility is " + eligibility);
	}
}
