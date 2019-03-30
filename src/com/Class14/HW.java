package com.Class14;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first 
		 * names and if they expecting boy or girl?
		 *  Based on the input suggests a name for a baby
		 */

		
		
		Scanner input = new Scanner(System.in);
		String motherName, fatherName, babyName, gender;
		
		System.out.println("Please enter mothers name");
		motherName=input.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=input.nextLine();
		
		System.out.println("Please enter expected Gender boy/girl");
		gender=input.nextLine();
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+motherName.substring(motherName.length()/2);
		}else if(gender.equalsIgnoreCase("girl")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+motherName.substring(motherName.length()/2);
		}else {
			babyName="No Suggestion";
		}
		System.out.println(babyName.toUpperCase());
	}

}
