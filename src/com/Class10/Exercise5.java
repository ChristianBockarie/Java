package com.Class10;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		/*Write a guessing game where the user has to guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number until he finds the correct number. 
		 * When the correct answer is found the system should display "Congratulations!!. You got it!".
		 */

		Scanner input = new Scanner(System.in);
		int secret, userInput;
		secret = 13;
		
		
		do {
			System.out.println("please enter a guessing number between 1 and 20");
			userInput= input.nextInt();
			
			if(userInput<secret) {
				System.out.println("Number too Small");
			}else if(userInput>secret) {
				System.out.println("Number too Large");
			}
		}while (secret!=userInput);
		
		System.out.println("Congratulations!!. You got it!");
		
		
		
	}

}
