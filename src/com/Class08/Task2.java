package com.Class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// let user define a range of numbers to print

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a starting number");
		int startNumber = input.nextInt();
		
		System.out.println("Please enter ending number");
		int endNumber = input.nextInt();
		
		if (startNumber < endNumber) {
			
			for(int i = startNumber; i <= endNumber; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("I wont run your code");
		}
	}

}
