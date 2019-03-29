package com.Class11;

public class ForLoopIn2DArray {

	public static void main(String[] args) {
		
		int [][] num= {
				{11,12,13,14,15},
				{21,22,23},
				{31,32,33,34},
		};
		
		int rows=num.length;
		System.out.println(rows);
		
		int column=num[2].length;
		System.out.println(column);
		
		for (int row=0;  row<num.length; row++) {
			
			for (int columns=0; columns<num.length; columns++) {
				System.out.println(num[row][columns]+" ");
			}
			System.out.println();
		}
		//
		String [][] food ={ 
				{"burger", "fries", "hot dog", "meatloaf"}, 
				{"lo mein", "fried rice"}, 
				{"biriyani", "korma", "naan", "chick peas"},
				};
		
		/*
		 * String americanFood= food[0][0]; 
		 * for (int i=0; i<food.length; i++) {
		 * 
		 * for (int j=0; j<food[i].length; j++)
		 *  { System.out.print(food[i][j] +" ");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */
		
		
		for(int i = 0; i < food.length; i++) {
			if(i== 0) {
				System.out.println(" This ia a list American food");
				for(int j =0; j<food[i].length; j++) {
					
					System.out.print(food[i][j]  + " ");
					
				}System.out.println();
			}
//			break;
			
			
		}
		
		
		
		
		
		

	}

}
