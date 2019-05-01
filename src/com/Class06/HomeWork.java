package com.Class06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*Using scanner class create calculator.
		 *Allow user to enter 2 numbers and operator(+,-,*,/)
		 *Based on operator provide the result to user
		 */

		Scanner input;
		double num1, num2, result;
		char operator;
		
		input = new Scanner(System.in);
		System.out.println("Please endter first number");
		num1 = input.nextDouble();
		System.out.println("Enter second number");
		num2 = input.nextDouble();
		System.out.println("Enter an operator");
		operator = input.next().charAt(0);
		
		switch (operator) {
			case '+':
				result = num1 + num2;
				break;
				
			case '-':
				result = num1 - num2;
				break;
				
			case '*':
				result = num1 * num2;
				break;
				
			case '/':
				result = num1 / num2;
				break;
				
			default:
				result = '0';
				System.out.println("Please enter a valid operator");
				
		}System.out.println("The result is " +result);
		
		
		 
	}

}
