package com.Class26;

public class SuperKeyword {
	String name = "John";
	
	public void sayName() {
		System.out.println("Parent name is "+name);
	}

}
class ChildOfSuperKeyword extends SuperKeyword{
	String name = "Micheal";
	
	public void sayName() {
		System.out.println("Parent name is " + super.name);//prints Parents (superKeyword) name
		System.out.println("Child name is " + name);//Prints Child (childofsuperkeyword) name
		//Super keyword is used to call parent class method
	}
	public void callingMethods() {
		sayName();//this.sayName
		super.sayName();
	}
}
