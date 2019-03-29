package com.Class12;

public class StringManipulation {

	public static void main(String[] args) {
		//length() function returns number of values in the double quote
		String str="Syntax";
		
		int len=str.length();
		System.out.println(len);
		
		String str1="Syntax Technologies";
		int len1=str1.length();
		System.out.println(len1);
		
	    String str2="Welcome, students!";
	    System.out.println(str2.length());
	    
	
	    
	    //PRINTING UPPER AND LOWER CASES IN STRINGS
	    String txt = "Hello World";
	    System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
	    System.out.println(txt.toLowerCase());   // Outputs "hello world"

		String newString=txt.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		//equals()- compare 2 strings, if strings are equal-->true, else------->false
		String str4="Hello";
		String str5="hello";
		
		boolean equality=str4.equals(str5);
		System.out.println(equality);
		//equalsIgnoreCase()
		String expectedBrowser="Chrome";
		String actualBrowser="CHROME";
		
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
	}

}
