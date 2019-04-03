package com.Class15;

public class Computer {

	boolean mouse, keyboard;
	int screen, ram;
	String OS, brand;

	public static void main(String[] args) {
		// ClassName variableName = new ClassName();
		// First Object
		Computer comp1 = new Computer();
		comp1.mouse = true;
		comp1.keyboard = true;
		comp1.screen = 2;
		comp1.ram = 8;
		comp1.OS = "Windows";
		comp1.brand = "SamSung";
		System.out.println("I love my " + comp1.OS + " Computer");
		// define behaviors
		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();
		System.out.println();

		System.out.println("-----Second Object-----");
		// Second Object
		Computer comp2 = new Computer();
		comp2.mouse = false;
		comp2.keyboard = false;
		comp2.screen = 4;
		comp2.ram = 6;
		comp2.OS = "Mac";
		comp2.brand = "Apple";

		System.out.println("I love my " + comp2.OS + " Computer");
		// define behaviors
		comp2.watchMovie();
		comp2.doJavaCoding();
		comp2.playMusic();
		System.out.println();
	}

	void watchMovie() {
		System.out.println("I can watch movie on my "  +brand+ " computer ");
	}

	void doJavaCoding() {
		System.out.println("I can do Java coding on my " +brand+ " computer ");
	}

	void playMusic() {
		System.out.println("I can play music on my " +brand+ " computer ");
	}
}
