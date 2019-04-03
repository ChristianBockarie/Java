package com.Sprinters;

public class Task1 {

	public static void main(String[] args) {
		/*Write a program to swap 2 Numbers without s temporary variable?
		 * Swap 2 strings without a temporary variable?
		 */

		int x=10;
		int y=20;
		System.out.println("Before Swapping int x = " +x+ " int y = " +y );
		x= x + y;
		y= x - y;
		x= x - y;
		System.out.println("After swapping int x = "+x+" int y = "+y );
		
		String a="hello";
		String b="world";
		System.out.println("Bfore swapping string a = "+a+" string b = " +b);
		a = a+b;
		b = b.substring(0, a.length()-b.length());
		a = b.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		b=b.substring(a.length());
		System.out.println("After swapping string a= "+a+" string b = "+b);
		
	}

}
