package com.Class23;

public class TestCalculate {

	public static void main(String[] args) {
		
		Calculate obj = new Calculate();
		obj.printArea(15, 30);//rectangle
		obj.printArea(3);//square
		obj.printArea(10, 20, 30);//cube
	}

}
