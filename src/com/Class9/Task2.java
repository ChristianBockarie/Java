package com.Class9;

public class Task2 {

	public static void main(String[] args) {
		/* I want to print pattern
		 * *
		 * **
		 * ***
		 * ****
		 */
		
		for (int a=0; a<4; a++) {
			for (int b=0; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
