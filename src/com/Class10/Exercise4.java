package com.Class10;

public class Exercise4 {

	public static void main(String[] args) {
		/*
		 * Print the following pattern: 
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 * ****** -------->midpoint 
		 * *****
		 * ****
		 * *** 
		 * **
		 * *
		 */

		for (int r = 1; r <= 6; r++) {//outerloop(row)
			for (int c = 1; c <= r; c++) {//innerloop(column)
				System.out.print("*");
			}
			System.out.println();
		}

		for (int r = 1; r <= 6; r++) {//outerloop(row)
			for (int c = 5; c >= r; c--) {//innerloop(column)
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
