package com.Class14;

public class Exercises {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces. 
		 */

		String hold = "Sentence In A String";
		String replace=hold.replaceAll(" ", "");
		System.out.println(replace);
		
		String[] array=hold.split(" ");
		for(String substring:array) {
			System.out.print(substring);
		}
		System.out.println();
		System.out.println("-----------------");
		
		/*Create a String that should be combination of letters, numbers and special Characters.
		 * Find out how many alpha characters are there in the string.
		 */
		String characters= "12ThisIsaSring*^%%";
		String rep=characters.replaceAll("[^A-Za-z]", "");
		System.out.println("The total amount of alpha characters in the string is " + rep.length());
		
		System.out.println("--------------------");
		/*You have a String a="Is it Saturday! Is it raining! Do we have a Java Class Today?"
		 * How would you find out how many sentences are in that String
		 */
		String a="Is it Saturday? Is it raining? Do we have a Java Class Today?";
		String [] str=a.split("\\? ");
		System.out.println("The length of the str is " + str.length);
		for(String substring:str)
		System.out.println(substring);
	}

}
