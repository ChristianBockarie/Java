package com.Class29;

public interface Shape {

	/*Create an Interface ‘Shape’ with undefined methods as calculateArea() and calculatePerimiter(). 
	Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation. 
	Test your code.
	*/
	
	void calculateArea();
	void claculatePerimeter();
}
class Circle implements Shape {

	@Override
	public void calculateArea() {
		int a=10;//radius
		double area=3.14*a*a;
		System.out.println("The area of a circle is "+area);
	}

	@Override
	public void claculatePerimeter() {
		int a=10;//radius
		double perimeter=2*3.14*a*a;
		System.out.println("The area of a circle is "+perimeter);
	}
}	
class Square implements Shape {

	@Override
	public void calculateArea() {
		int l=10; int h=l;
		int area=l*h;
		System.out.println("The area of a circle is "+area);
	}

	@Override
	public void claculatePerimeter() {
		int l=10;
		int perimeter=l*4;
		System.out.println("The area of a circle is "+perimeter);
	}
	
}