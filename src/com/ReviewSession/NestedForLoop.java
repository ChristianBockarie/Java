package com.ReviewSession;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=5; i++) {
			for (int y=1; y<=10; y++) {
				System.out.print(i*y+" ");
			}System.out.println();
		}
		System.out.println();
		
		for (int i=1; i<=5; i++) {
			for (int y=5; y>0; y--) {
				if(y<=i)
				System.out.print(i);
			else {
				System.out.print(".");
			}
			}System.out.println();
		
			}
			
}
}