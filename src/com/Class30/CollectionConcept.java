package com.Class30;

public class CollectionConcept {

	public static void main(String[] args) {
		//initializing variables
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		int[] array = {10,20,30,40};//Total amount of elements displayed in their index form 
		int[] intArray=new int[4];//This line should show the SIZE of the array elements
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		intArray[3]=40;
		
		//to print an array
		int num=intArray[2];
		System.out.println(num);
		
		//Looping and printing all array using For loop
		for (int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		for(int number: intArray) {
			System.out.println(number);
		}
		
	}
	

}
