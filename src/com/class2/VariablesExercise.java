package com.class2;

public class VariablesExercise {

	public static void main(String[] args) {
		String name="Christian";
		String lastname=" Bockarie";
		String fullname=name + lastname;//both last and first name display together 
		char grade='B';
		String city="Alexandria";
		String state="VA";
		long phonenumber=5712888151l;
		String example="+example+";
		
			System.out.println("My fullname is " +fullname+"");
			System.out.println("My name is "+name+" and my last name is"+lastname+"");
			System.out.println("I am a "+grade+" student");
			System.out.println("I live in the city of "+city+" in a state of "+state+"");
			System.out.println("My Phone number is "+phonenumber+"");
			
			//the double quotation (") should be added with a plus (+) sign at the front and back of the variable for it to be added to a statement which should be printed.
			//example is system.out.println("This is an "+example+"").
			System.out.println("This is an "+example+"");
	}

}