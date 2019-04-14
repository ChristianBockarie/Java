package com.Class23;

public class Calculate {
	
	//Rectangle - length*width
	public void printArea(int l, int w) {
		System.out.println("Calculating the area of a rectangle");
		System.out.println(l*w);
	}
	//Square - width*width
	public void printArea(int a) {
		System.out.println("calculating the area of a square");
		System.out.println(a*a);
	}
	//Cube - length*width*height
	public void printArea(int l, int w, int h) {
		System.out.println("calculating the area of a cube");
		System.out.println(l*w*h);
	}
}
