package com.class7;

public class Task {

	public static void main(String[] args) {
		/*create a boolean variable workDay and assign true
		 * create int variable day and assign it to 1
		 * as long as it is workDay print----> "I need a day off" and increment day
		 * day once day is 6 ----> your condition should become false */

		boolean workDay = true;
		int day = 1;
		
		while (workDay) {
			System.out.println("I need a day off ");
		
			 if (day==6) {
				 System.out.println("I Do not need a day off " +day);
				 workDay = false;
			 } day++;
			
	}
	}
}
