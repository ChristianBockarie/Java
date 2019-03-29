package com.ReviewSession;

import java.util.Scanner;

public class Lasttask {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("What is your Name?");
		String name = input.nextLine();
		System.out.println("Name: "+name);
		
	
		System.out.println("What is your Gender?");
		char gender = input.next().charAt(0);
		System.out.println("Gender: "+gender);
		
		System.out.println("What is your Age?");
		int age = input.nextInt();
		System.out.println("Age: "+age);
		
		System.out.println("What is you Mobile Number?");
		String mobileNo = input.nextLine();
		System.out.println("Mobile Number "+mobileNo);
		
		//char  = input.next().charAt(0);
		
		
		
	}

}
