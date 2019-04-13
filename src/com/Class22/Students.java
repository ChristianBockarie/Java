package com.Class22;

public class Students {
	
	String name;

	/*Write a java program of Class Students that takes students name and 3 subject grades.
	 *  Inside your class also have a method to Calculate Average Grade. 
	 *  Test Student class for 5 different students with different marks. 
	 *  Your program should print an average mark of each students name.
	 */
		//NOTE: please male different names for instance and local variables.
//	public static String studentName;
	
	
//	public Students(String name) {
//		
//		System.out.println(name);
////		studentName=name;
//	}
//	public Students(String name, int a, int b, int c) {
////		int average;
//		
//		System.out.println(name + "'s average score is : " + (a+b+c/3));
//	}
//	public static void display() {
////		String info=studentName+" and " + average;
////		System.out.println(info);
//		
//		Students student1 = new Students("Christian");
//		Students student2 = new Students("Christian", 10, 20, 30);
//
//		
//	}
	
	
	
	public Students(String name) {
		
		//System.out.println(name);
//		studentName=name;
		
		this.name = name;
	}
	public Students(String name, int a, int b, int c) {
	int average = a+b+c/3;
	
	display(name, average);
	}
	private void display(String name, int average) {
		System.out.println(name + "'s average score is : " + average);		
	}
	public static void display() {
//		String info=studentName+" and " + average;
//		System.out.println(info);
		
		Students student1 = new Students("Christian");
		Students student2 = new Students("Christian", 10, 20, 30);

		
	}
}
