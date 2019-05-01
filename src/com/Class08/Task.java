package com.Class08;

public class Task {

	public static void main(String[] args) {
		
		//Print from 1 to 100
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		//Print numbers from 100 to 1
		for (int i=100; i>=1; i--) {
			System.out.println(i);
		}
		
		//Print odd numbers from 1 to 20(2 ways)
		for (int i=1; i<=20; i+=2) {
			System.out.println(i);
		}
		
		//print even numbers from 20 and 1(2 ways)
		for (int i=20; i>=1; i-=2) {
			System.out.println(i);
		}
		
		//Print even numbers between 20 and 50(2 ways)
		for (int i=20; i<=50; i+=2) {
			System.out.println(i);
		}
		//2way
			for (int i=20; i<=50; i++) {
				if (i%2==2) {
			System.out.println(i);
		}
		
		//print odd numbers between 20 and 50(2 ways)
				for (int a=20; a<=50; a+=2) {
					System.out.println(a);
				}
				//2way
					for (int a=20; a<=50; a++) {
						if (a%2==1) {
					System.out.println(i);
				}
				
				
			
	
	}

	}
}
}