package com.Class26;

public class Students {
	
	String fullName;
	int age;
	
	public Students(String name, int ageNum) {
		fullName=name;
		age=ageNum;
	}
	
	public void displayDetails(){
		System.out.println("Students full name is "+fullName+" and age is "+age);
	}
	public static void main(String[] args) {
		
		Students obj = new Students("John Snow", 30);
		obj.displayDetails();

	}

}
