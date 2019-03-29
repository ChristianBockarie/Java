package com.Class10;

public class Task2 {

	public static void main(String[] args) {
		/*Create an array of names and store all names of your group. 
		 * Then print your name from that array. (Use 2 different ways of creating an array).
		 */

		String[] names= {"Christian", "Anil", "German", "Aman", "Zou"};
		System.out.println(names[0]);
		
		String[] name=new String[5];
		name[0]="Christian";
		name[1]="Anil";
		name[2]="German";
		name[3]="Aman";
		name[4]="Zou";
		System.out.println(name[0]);
	}

}
