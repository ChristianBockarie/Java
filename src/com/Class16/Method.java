package com.Class16;

public class Method {
	//methods and variables are members of the class
	String str;
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello Friends");
		System.out.println("Hello");
		System.out.println("Hello Friends");
	}
	
	void bye() {
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {//method signature
		
		Method obj=new Method(); //method body
		
		obj.hello();//we calling the hello method
		obj.bye();//we calling the bye method
		
		/* Methods themselves are methods and we can't create methods in methods
		 * In order to execute the method, we have to create them out of the main method
		 */
		
	}

}
