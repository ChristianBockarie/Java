package com.Class15;

public class Phone {
	String make, brand, model, memory, color;
	boolean touchScreen;
	
	public static void main(String[] args) {
		
		Phone make1 = new Phone();
		make1.make="iphone";
		make1.brand="Apple";
		make1.model="6Splus";
		make1.memory="64gb";
		make1.color="Space Gray";
		make1.touchScreen=true;
		make1.pictures();
		make1.music();
		make1.apps();
		
		Phone make2 = new Phone();
		make2.make="Android";
		make2.brand="Samsung";
		make2.model="Galaxy S9";
		make2.memory="32gb";
		make2.color="Gold";
		make2.touchScreen=true;
		
		Phone make3 = new Phone();
		make2.make="Nokia";
		make2.brand="Windows";
		make2.model="Lumia";
		make2.memory="128gb";
		make2.color="Black";
		make2.touchScreen=false;
		make2.pictures();
		make2.music();
		make2.apps();
		
	}
	void pictures() {
		System.out.println("Can take pictures on my "+brand+ " " +make+ " phone");
	}
	void music() {
		System.out.println("Can play music on my phone");
	}
	void apps() {
		System.out.println("Can downlaod apps on my phone");
	}

}
