package com.Class07;

public class IncrementDecrement {

	public static void main(String[] args) {
		/*
		 * When Incrementing in Java, we use ++ When decrementing in java, we use --
		 */

		// INCREMENT

		int a = 10;
		int b = ++a; // a = a +1 and then b=a
		// when you pre-increment, you increment for "C" and declare it for "D"
		System.out.println(a);// 11
		System.out.println(b);// 11

		int c = 10;
		int d = c++;// f= e and then e = e+1
		// when you post increment, you wont be incrementing for "E". you will be
		// declaring "F" as equal to "E"
		System.out.println(c);// 10
		System.out.println(d);// 11

		/**
		 * Declare a variable a ,print out the value and increment the value by one and
		 * print the value of a
		 * 
		 */
		int g = 10;

		System.out.println("this is g: " + g++);// g = g +1
		System.out.println(g);

		int x = 15;
		System.out.println(x);
		x++; // x = x+1;

		x = ++x; // ++x either x = x+1; x++

		System.out.println(x);

		// DECREMENT
		int q = 100;
		int e = q--;

		System.out.println("Value of e is " + e);// 100 or 99?
		System.out.println("Value of q is " + q);// 99
		int h = 50;
		int l = --h;// first decrement --> assign
		System.out.println("Value of h is " + h);// 49 or 50?
		System.out.println("Value of l is " + l);// 49 or 50?
	}

}
