package com.Class9;

public class Clock {

	public static void main(String[] args) {
		// 24 hours a day, 60 minutes

		for (int h=0; h<24; h++) {
					
			for (int m=0; m<60; m++) {
				
				//always add an "IF CONDITION" if you want to print double digit and the condition giving starts with a single digit
				
				if (m<10) {
					System.out.println(h+":0"+m);
				}else {
				System.out.println(h+":"+m);
			}
		}
	}

	}
}	
