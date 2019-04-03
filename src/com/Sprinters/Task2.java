package com.Sprinters;

public class Task2 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 966, 458 };
		
		int largest = array[0];
		int Secondlargest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				Secondlargest = largest;
				largest = array[i];
			} else if (array[i] > Secondlargest) {
				Secondlargest = array[i];
			}
		}
		System.out.println("The second largest is " + Secondlargest);
		
		int[] numbers = { 200, -20, 13, 499, 650000 };
		int maximum = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maximum) {
				maximum = numbers[i];
			}
		}
			int[] smallest = numbers;
			int minimum = smallest[0];
			for (int i = 0; i < smallest.length; i++) {
				if (smallest[i] < minimum) {
					minimum = smallest[i];
		}
		
	}
			System.out.println("maximum " +maximum+ " and minimum " +minimum);
}
}