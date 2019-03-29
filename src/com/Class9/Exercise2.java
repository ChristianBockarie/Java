package com.Class9;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. Whenever user done with
		 * payments tell them "Thank you for shopping!"
		 */

		Scanner input = new Scanner(System.in);
		String item;
		double price, balance, payment, totalPayment = 0, change;

		System.out.println("Please enter item");
		item = input.nextLine();

		System.out.println("Please enter price");
		price = input.nextDouble();

		do {
			System.out.println("Please enter your payment amount");
			payment = input.nextDouble();

			totalPayment = totalPayment + payment;

			if (totalPayment > price) {
				change = totalPayment - price;
				System.out.println("Please take your change " + change);
				break;
			} else if (totalPayment < price) {
				balance = price - totalPayment;
				System.out.println("Your balance is $" + balance);
			}

		} while (totalPayment != price);
		System.out.println("Thank you for shopping");

	}
}