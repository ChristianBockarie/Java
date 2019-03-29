package com.ReviewSession;

public class Task {

	public static void main(String[] args) {
		/*
		 * Write a program that prints out the string "the time is 07:min and then all
		 * the mins till 7:30
		 */

		for (int min = 0; min <= 30; min++) {
			if (min < 10)
				System.out.println("the time is 07:0" + min);
			else {
				System.out.println("them time is 07:" + min);
			}

			int min1 = 0;
			while (min1 <= 30) {
				if (min1 < 10)
					System.out.println("the time is 07:0" + min1);
				else {
					System.out.println("the time is 07:" + min1);
				}

			}
		}
	}
}