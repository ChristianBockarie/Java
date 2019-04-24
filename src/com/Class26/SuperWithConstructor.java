package com.Class26;

public class SuperWithConstructor {
	
	public SuperWithConstructor() {
		System.out.println("I am a parent class contructor");
	}
	SuperWithConstructor(String str){
		System.out.println("I am a parent class constructor with 1 parameter " + str);
	}

}
class ChildOfSuperWithConstructor extends SuperWithConstructor {

	public ChildOfSuperWithConstructor () {
		super("Hello");
		System.out.println("I am a child class constructor");
	}
}