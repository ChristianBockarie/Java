package com.Class30;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		//Generic Array that stores only String Objects
		ArrayList<String>names=new ArrayList<String>();
		names.add("John");
		names.add("James");
		names.add("Joe");
		names.add("Peter");
		names.add("Mary");
		
		System.out.println(names.isEmpty());//Finding to see whether arrayList is empty using boolean
		System.out.println(names.contains("Jane"));//Finding to see  whether arrayList contains the name using boolean
		System.out.println(names.size());//Printing the size of the arrayList
		
		//Printing all the values of the ArrayList
		//Using For loop
		//for(DataType variableName:objectName){SOP(variableName);}
		for (String allValues:names) {
			System.out.println(allValues);
		}
		
	}

}
