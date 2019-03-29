package com.Class10;

public class Exercise3 {

	public static void main(String[] args) {
		/*
		 * Print the following pattern: 1 12 123 1234 12345
		 */
		// r= ROW(OUTER for)
		// c= COLUMN(INNER for)
		
		for (int r = 1; r <=10; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c);
			}System.out.println();
		}
		
		for (int r = 10; r >= 1; r--) {
			for (int c = 1; c<r; c++) {
				System.out.print(c);
			}
			System.out.println();

		}
	}
}