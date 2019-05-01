package com.Class30;

public class WrapperClass {

	public static void main(String[] args) {
		
		int a=10;//Declaring variable
		//Using Wrapping to box in order to convert int into an object using the new keyword
		Integer i = new Integer(a);//Boxing
		System.out.println(i);//Printing out object I.
		Integer i2=a;//AutoBoxing
		
		int num=i.intValue();//Unboxing
		System.out.println(num);
		
		int num2=i2.intValue();//AutoUnboxing
		System.out.println(num2);


	}

}
