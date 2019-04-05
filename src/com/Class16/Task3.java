package com.Class16;

public class Task3 {

	public static void main(String[] args) {
		/* Create a method that will print 
		 * whether given string is palindrome or not
		 */
		Task3 obj=new Task3();
		obj.palindrome("", "nursesrun");

	}
	void palindrome(String reverse, String word) {
		for (int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);
		}
		if (word.equals(reverse)) {
			System.out.println("The word is a palindrome");
		}else {
			System.out.println("The word is not a palindrome");
		}
	}

}
