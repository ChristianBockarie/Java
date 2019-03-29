package com.Class11;

public class Largest {

	public static void main(String[] args) {
		// Create an array of integers and find the largest number
		// LARGEST NUMBER
		int[] largestNumber = { 101, 20, 11, 406, 50 };

		int largest = largestNumber[0];

		for (int i = 0; i < largestNumber.length; i++) {

			if (largestNumber[i] > largest) {
				largest = largestNumber[i];
			}
		}
		System.out.println("The largest number is " + largest);

		System.out.println("------------");

		// SMALLEST NUMBER
		int[] smallestNumber = { 206, 74, 8, 496 };

		int smallest = smallestNumber[0];

		for (int i = 0; i < smallestNumber.length; i++) {

			if (smallestNumber[i] < smallest) {
				smallest = smallestNumber[i];
			}
		}
		System.out.println("The smallest number is " + smallest);
	}

}
