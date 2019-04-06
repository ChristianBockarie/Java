package com.Class17;

public class Task3 {

	public static void main(String[] args) {
		
		/* I want to print 
		 * ****** 
		 * *    * 
		 * *    * 
		 * ******
		 */

		for (int a = 1; a <= 4; a++) {

			for (int b = 1; b <= 6; b++) {

				if (a == 1 || a == 4 || b == 1 || b == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();

		}
	}

}
