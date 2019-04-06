package com.Class17_2;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		NestedLoopDemo demo = new  NestedLoopDemo();
		demo.printNumber();

	}
	
	void printNumber() {

		for (int i=1; i<=3; i++) {
			
			for (int y=1; y<=5; y++) {
				
				System.out.println(i+" "+y);
			}
		}
	}

}
