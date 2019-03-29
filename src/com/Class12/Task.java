package com.Class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		/*
		 * Accept username, password and confirm password and check following
		 * requirements:
		 * 
		 * 1. Username and Password cannot be empty, if so ---> message= ”Username and
		 * Password cannot be empty”. 2. Password should be minimum 8 characters, if
		 * less ---> message= ”Password is too short”. 3. Password cannot contain
		 * username if so, ----> message= ”Password cannot contain username”. 4.
		 * Password should match confirmed password, if not -----> message “Passwords do
		 * not match”. 5. Only after all requirements met ------> message “Your username
		 * and password has been created”
		 */

		Scanner input = new Scanner(System.in);
		String userName, passWord, confirmPassWord;

		System.out.println("Enter UserName");
		userName = input.nextLine();
		System.out.println("Enter PassWord");
		passWord = input.nextLine();
		System.out.println("Confirm Password");
		confirmPassWord = input.nextLine();

		if (!(userName.isEmpty() || passWord.isEmpty())) {

			if (passWord.equals(passWord)) {
				System.out.println("Password is too short");
				
				if (passWord.contains(userName)) {
					
				if (passWord.equals(confirmPassWord)) {
					System.out.println("Created");
				} else {
					System.out.println("Password do not match");
				}

			} else {
				System.out.println("Password is too short");
			}

		} else {
			System.out.println("Password cannot be empty");
		}

	}

}
}