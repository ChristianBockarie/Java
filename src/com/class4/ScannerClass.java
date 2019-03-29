package com.class4;

import java.util.Scanner;

public class ScannerClass {

	private static Scanner abc = new Scanner(System.in);

	public static void main(String[] args) {
		// ask user for the name and print Good morning ____

		System.out.println("Please enter your name");

		String name = abc.nextLine();

		System.out.println("Good morning " + name);

	}
}
