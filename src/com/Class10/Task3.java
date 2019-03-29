package com.Class10;

public class Task3 {

	public static void main(String[] args) {
		/*Create an array of words: Java, Saturday, day, coding, is.
		 * Print the following sentence using element of array: "Saturday is Java Coding Day".
		 */
	
		String[] words= {"Java", "Saturday", "Day", "Coding"};
		System.out.println(words[1]+" is " +words[0]+ " "+words[3]+ " "+words[2]);
		
		String[] word=new String[4];
		word[0]="Java";
		word[1]="Saturday";
		word[2]="Day";
		word[3]="Coding";
		System.out.println(words[1]+" is " +words[0]+ " "+words[3]+ " "+words[2]);
		
	}
	

}
