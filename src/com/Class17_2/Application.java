package com.Class17_2;

import java.util.Scanner;

import com.Class17.Calculator;

public class Application {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		int a = 20, b = 15;
		int c = obj.sum(a, b);
		System.out.println(c);
		
	}
}