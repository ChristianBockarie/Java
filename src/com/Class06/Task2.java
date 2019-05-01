package com.Class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*Allow user to enter grade and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade ----> Not Acceptable
		 * At the end your program should print which grade was entered by a user with explanation. 
		 */
			
		Scanner input;
		char grade;
		String gradeLevel;
		
		input = new Scanner(System.in);
		System.out.println("Please Enter your grade");
		grade = input.next().charAt(0);
		
		switch (grade) {
			case 'A':
				gradeLevel = "Excellent";
				break;
			
			case 'B':
				gradeLevel = "Good";
				break;
			
			case 'C':
				gradeLevel = "Average";
				break;
			
			case 'D':
				gradeLevel = "Bad";
				break;
				
			default:
				gradeLevel = "Not Acceptable";
				
		}System.out.println("Your grade is " +gradeLevel);
	}

}
