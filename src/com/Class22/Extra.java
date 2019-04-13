package com.Class22;

public class Extra {
	
	private String name;
	private int age;
	
	Extra(){
		
	}
	Extra(String name, int age){
		
		this.name = name;
		this.age = age;
	}

	
	
	
	public static void main(String[] args) {
		Extra xtra = new Extra();
		
		Extra xtra2 = new Extra("Christian", 10);
		
		System.out.println("Hey this is " + xtra2.name	+ " and his age is :" +xtra2.age);
	
	}
	
	
	
	
}
