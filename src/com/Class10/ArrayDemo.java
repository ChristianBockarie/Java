package com.Class10;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//declaring array
		int [] numbers=new int[4];
		
		//assigning elements in the array
		//Total elements should always match the number declared in the array[]
		
		numbers[3]=10;
		numbers[2]=5;
		numbers[0]=1;
		numbers[1]=15;
		
		//once you assign the elements, print in order to access the values assign to the element 
		System.out.println(numbers[2]);
	}

}
