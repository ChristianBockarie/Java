package com.Class21;

public class InstanceVariables {//instance variable

	/* Instance variables are created within the class. They can have access modifiers
	 * Instance cannot be created within the method.
	 * Instance variable are created when the object are created with the use of "NEW" keyword. once the 
	 * object dies, the instance variable dies with it.
	 */
	
		public String name = "John";
	
	public static void main(String[] args) {//local variable
		
		String name = "Anna";
		System.out.println(name);
		System.out.println("---Changing value of local variable---");
		name="Olga";
		System.out.println(name);
		
		//creating 1 object 
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		
		System.out.println("---changing value of instance variable---");
		
		obj.name="Jack";
		System.out.println(obj.name);
		
		
		//creating 2 object
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		
	}
	public void hello() {
		System.out.println("Hello " +name);
	}

}
