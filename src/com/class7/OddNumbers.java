package com.class7;

public class OddNumbers {

	public static void main(String[] args) {
		/*print only odd numbers from 1 to 20*/
		
	int num = 1;
		
		while (num <=20) {
			if (num % 2 != 0) {
			System.out.println(num);
			}
			num++;
	}

		/*print only even number from 10 to 100*/
		
		int num1 = 10;
		
		while (num1<=100){
			if (num1 % 2== 0) {
				System.out.println(num1);
			}
			num1++;
		}
		
		//in doing the while loop the increment should be after the block for it to be able to execute the amount of time in the IF condition
		
}
}
