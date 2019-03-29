package com.Class10;

public class ArrayCreation {

	public static void main(String[] args) {
		//declaring and assigning the element in the array all at once
		int[] array= {10,20,30,40};
		
		//to print, enter the index of the value in the array and the indexes always start from "0"
		System.out.println(array[2]);
		
		//to find the size of the variable array. when finding the length of values in the variable, we count form "1"
		System.out.println(array.length);
		
		//String of names = 5
		String[] names = {"john", "mike", "abdul", "musa", "robert", "jones"};
		System.out.println("There are "+names.length+" vaules in my array of names");
		System.out.println(names[2]);//to print abdul
		
		//when declaring values to variables in the array, they should be on the same line 
	}

}
