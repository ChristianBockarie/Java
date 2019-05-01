package com.Class31;

import java.util.ArrayList;

public class Cars {

	public static void main(String[] args) {
		ArrayList<String>cars=new ArrayList<>();
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Dodge");
		cars.add("Ford");
		
		//1 way
		System.out.println("-----using for loop------");
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		//2 way
		System.out.println("----using advance for loop------");
		for(String list:cars) {
			System.out.println(list);
		}
		
		//3 way
	}

}
