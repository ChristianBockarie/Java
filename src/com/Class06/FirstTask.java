package com.Class06;

import java.util.Scanner;

public class FirstTask {
	/*
	 * write a program that prints out if it is good weather to go for any activity
	 * 
	 * If the temperature is between 40 degrees and 80 degrees & no rain ---> we
	 * will go for hiking otherwise we will not go hiking
	 * 
	 * If temperature is between 25 and 40 inclusive & snowing ---> going snow
	 * boarding otherwise we are not going snow boarding
	 * 
	 * If if temperature is more than 80 & sunny ----> go to the beach otherwise not
	 * go to the beach
	 */
	public static void main(String[] args) {

		Scanner input;
		boolean snow, rain, sunny;
		int temp;
		String activity; 
		
		

		input = new Scanner(System.in);

		System.out.println("Please Enter Temperature");
		
		temp = input.nextInt();
		

		if(temp >= 40 && temp <= 80) {
			System.out.println("Is it raining?");
			rain = input.nextBoolean();
			
			if(rain) {
				activity = "no hiking";
			} else {
				activity = "go hiking";
			}
			
			
		} else if (temp >= 25 && temp < 40) {
			System.out.println("Is it snowing?");
			snow = input.nextBoolean();
			
			if (snow) {
				activity = "snow boarding";
			} else {
				activity = "no snow boarding";
			}
			
		} else if (temp > 80) {
			System.out.println("Is it sunny?");
			sunny = input.nextBoolean();
			
			if (sunny) {
				activity = "go to the beach";
			} else {
				activity = "not going to the beach";
			}
		
		}else {
		System.out.println("activity is unknown");
			activity = "unknown";
		}
		System.out.println("My activity for today is " + activity);

		
	}
}
