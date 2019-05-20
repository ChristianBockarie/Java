package com.Class35;

import java.util.Scanner;

public class MismatchException {

	public static void main(String a[]) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter name");
		try {
			int name;
			name = input.nextInt();
		} catch (Exception e) {
			System.out.println("Mismatch exception " + e);
		}
	}
}
