package com.Class10;

public class AllValues {

	public static void main(String[] args) {
		
		char[] grades= {'A','B','C','D','E','F'};
		
		//Because wed have 6 length, for us to find the index number we do size-1
		
		//formula for index is "SIZE-1" in the for  = loop (we do this so that the loop does not go over our index
		for (int i=0; i<=grades.length-1; i++ ) {
		System.out.println(grades[i]);
		
	}

}
}