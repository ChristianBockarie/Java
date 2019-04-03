package com.Class14;

public class StringSplit {

	public static void main(String[] args) {
		
		
		String str="Wecome Syntax Students! Batch 4 you are great";
		String[] array=str.split("! ");//it splits the character specified in the statement
		System.out.println("The length of the array is " + array.length);
		for(String substring: array) {
			System.out.println(substring);
		}
		System.out.println("---------------");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
