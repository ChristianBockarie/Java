package com.Class26;

public class EmployeeTest {

	public static void main(String[] args) {
		Tester tester = new Tester("John", "Snow", 90000);
		//Tester tester1 = new Tester(90000);Cannot print because there is no constructor with one parameter
		tester.displayDetails();
		

	}

}
