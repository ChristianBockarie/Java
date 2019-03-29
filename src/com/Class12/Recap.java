package com.Class12;

public class Recap {

	public static void main(String[] args) {
		
		int[][] arr= {
				{1,2,3},
				{10,20,30},
				{100,200,300},
		};
						//how many arrays
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) { //0 //1 //2
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
		
		System.out.println("--------for each loop---------");
		
		for (int[] singleArray:arr) {
			for (int numbers:singleArray) {//{1,2,3}
				
				System.out.print(numbers + " ");
			}
			System.out.println();
		}
		
		
	}

}
