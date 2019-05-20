package com.Class36;

import java.util.Scanner;

public class Withdrawal {
	
	//605350319/181	
	
	static int balance = 4000;

	public static void main(String[] args) {
		
		System.out.println("currrent balance : $ " +balance);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter withdrawal Amount : $$ ");
		
		int withdrawalAmount = input.nextInt();

		if (balance >= withdrawalAmount) {
			
			System.out.println("Coninue with your withdrawal proceess");
			
		} else {
			
			throw new ArithmeticException("Acsess Denied : Insufficient fund!");
			
		}
	}

}
