package com.Class22;

public class Task1 {
	
	
	public Task1(String test){
		System.out.println("Contructor with one parameter " + test);
	}
	public Task1(){
		System.out.println("Constructor without any parameters");
	}
	public static void main(String[] args) {
		Task1 obj = new Task1("test");
		Task1 obj1 = new Task1();
	}

}
