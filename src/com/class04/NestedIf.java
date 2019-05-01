package com.class04;

public class NestedIf {
	public static void main (String[] args) {
		
		double GPA=3.6;
		double expectedGPA=3.5;
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulations");
			if (GPA>expectedGPA) {
				System.out.println("You are hired");
			}else {
				System.out.println("Unfortunately we cannot hire you");
			}
		}else {
			System.out.println("Please get your degree");
		}
	}
}
