package com.Class11;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// Creating 2D array
		/* 2 D array consist of Rows and Columns
		 * syntax ---> dataType[] arrayName = new dataType[row][column] ;
		 * int [][] array = new int [] [] ;
		 */

		
		
		//DECLARING 2D ARRAY AND THEN ASSIGNING VALUE TO ITS ELEMENTS
		
		int [][] d= new int [4][4];//4*4=16 elements
		//1 row
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		//2 row
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		//3 row
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		
		System.out.println(d[2][3]);// to print 20
		
		System.out.println("------------------");
		
		//DECLARING AND ASSIGNING VALUES AT THE SAME TIME 
		
		int [][] e = {
				{12,13,14,15},
				{1,2,3,4},
				{5,10,15,20},
		};
	}

}
