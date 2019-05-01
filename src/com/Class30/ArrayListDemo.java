package com.Class30;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList<String> list=new ArrayList<String>();//Creating array list  
		ArrayList <String> greetings=new ArrayList<String>();
		greetings.add("Hello");
		greetings.add("Welcome");
		greetings.add("Hi");
		greetings.add("Bye");
		
		System.out.println(greetings.get(1));//Printing the index in the array list
		System.out.println(greetings.size());//The total amount of element in the array list

		//Collection are grow-able in Size
		greetings.add("How are you?");
		greetings.add("How are you?");
		greetings.add("How are you?");
		System.out.println(greetings.size());//Getting the size of the array list
		
		//Printing all the array list using FOR loop
		for (int i=0; i<greetings.size(); i++) {//For arrayList we use the Size instead of Length to print all the array list
			System.out.println(greetings.get(i));//we use the get(index) to print access an element at the specified index
		}
		
		//Printing the array list using the advance For loop
		for (String greetwords:greetings) {
			System.out.println(greetwords);
		}
	}

}
