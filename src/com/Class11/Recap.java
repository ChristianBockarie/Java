package com.Class11;

public class Recap {
	public static void main(String[] args) {

		// Lets create an array of names that will hold 5 elements and retrieve all values

		String[] names = new String[7];

		names[0] = "Asel";
		names[1] = "Awet";
		names[2] = "Arif";
		names[3] = "Weqas";
		names[4] = "Dzmitry";
		names[5] = "Shiva"; // will get a runtime exception when trying to access it
		names[6] = "Sandesh";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		

		// 2. Create an array using array literal
		// index 0 1 2 3 4 5
		String[] studentNames = { "Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };
		System.out.println("----------For loop----------");
		for (int i = 0; i <= studentNames.length - 1; i++) {
			System.out.println(studentNames[i]);
		}

		

		// retrieve values using : advanced for loop, for each loop, enhanced for loop
		System.out.println("----------Advanced for loop------------");
		for (String student : studentNames) {
			System.out.println(student);
		}
	}

}
