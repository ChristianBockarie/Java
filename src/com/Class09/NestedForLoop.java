package com.Class09;

public class NestedForLoop {

	public static void main(String[] args) {
		
		
		/*In the for nested for loop, the FOR loop is known as the Outer loop which is the controller of the Nested for loop
		 which can be known as the Inner loop. The outer loop defines how many times the inner loop is executed
		  The Nested for loop(inner loop) will only execute if the FOR(outer) is true.
		  Once the inner loop start executing, it will keep on executing until it becomes false. As soon as it becomes false, the iteration jumps to the 
		  outer loop to check the condition.
		 */
		
		
		//Outer loop
		for (int i=0; i<3; i++) {
			System.out.println("-----------------I am outer loop-----------------");
			
			//Inner loop 
			for (int y=0; y<3; y++) {
				System.out.println("I am inner loop " +y);
			}
		}

	}

}
