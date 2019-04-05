package com.Class16;

public class Task2 {

	public static void main(String[] args) {
		/*Create a method that will take a number
		 * and prints whether the number is even or odd
		 */
		Task2 obj=new Task2();
		obj.evenOrOdd(17);
	}
	void evenOrOdd(int num) {
		if(num%2==0) {
			System.out.println(num + " is even number");
		}else {
			System.out.println(num + " is odd number");
		}
	}

}
