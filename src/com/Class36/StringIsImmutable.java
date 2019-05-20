package com.Class36;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StringIsImmutable {

	public static void main(String[] args) {
		// Strings are immutable object because they are unchangeable.

		// 2 ways to build a String:

		// 1. using String Literal

		String str = "Hello";

		// 2. Using new keyword

		String str2 = new String("Bye");

		str = str.toUpperCase();
		str = str.replace("O", "a");

		System.out.println(str);
	}

}