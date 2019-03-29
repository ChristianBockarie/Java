package com.Class11;

public class ClassExercise2 {
	
	public static void main(String[] args) {
		
		/*Create an array of countries:
		 * north America countries, south America countries, European countries, Asian countries, African countries.
		 * Then print all values from that array
		 */
		
		String[][] countries = {
				{""},//north american countries
				{},//south american countries
				{},//
				{},
				{},
		};
		for (int i=0; i<countries.length; i++) {
			
			for (int c=0; c<countries[i].length; c++) {
				System.out.println(countries[i][c] + " ");
			}
		}
		
	}
}
