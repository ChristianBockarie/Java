package com.Class21;

public class LocalVariables {

	public static void main(String[] args) {
		/* Local Variables can only be accessible within the method.
		 * Modifiers cannot be used with a local variable
		 */

		String name = "John";
		//System.out.println(name);
		
		LocalVariables obj = new LocalVariables();
		obj.hello(name);
		System.out.println(name);
	}
 
	public void hello(String name) {
		name="Jack";
		System.out.println("Hello " + name);
	}
}
