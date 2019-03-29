package com.Class9;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		/* Write a program that reads a range of 
		 * integers, provided by a user and then prints the sum of the even and odd integers.
		 */
		
		Scanner input = new Scanner(System.in);
		int startRange, endRange;
		int sumOfEven=0, sumOfOdd=0;
		
		System.out.println("Please enter a range of number");
		startRange = input.nextInt();
		endRange = input.nextInt();
		
		if (startRange<endRange) {
		
		for (int i=startRange; i<=endRange; i++) {
			
			if (i%2==0) {
				sumOfEven+=i;
			}else {
				sumOfOdd+=i;	
				}
			
		System.out.print("sum of even number " +sumOfEven);
		System.out.println("sum of odd number " +sumOfOdd);

		}
		}
}
}