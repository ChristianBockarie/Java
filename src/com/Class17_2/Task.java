package com.Class17_2;

public class Task {

	public static void main(String[] args) {
		/*I want to print pattern
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		Task demo = new Task();
		demo.printTask();
		
	}
	void printTask() {
		for (int a=0; a<4; a++) {
			for (int b=5; b>=1; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
