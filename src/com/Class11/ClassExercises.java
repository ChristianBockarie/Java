package com.Class11;

public class ClassExercises {

	public static void main(String[] args) {
		/* Create an array of cars : 
		 * American cars, German cars, Korean cars, Italian cars.
		 * Then retrieve all values from that array
		 */

		String [][] cars = {
				{"Ford", "Honda", "Toyota", "Subaru"},//american cars
				{"BMW", "Mercedes"},//german cars
				{"Kia", "Hyundai"},//korean cars
				{"Ferari", "Maserati", "Lambo"},//italian cars
		};
			for (int i=0; i<cars.length; i++) {
				if (i==0) {
					System.out.println("These are list of American cars");
				}else if (i==1) {
					System.out.println("These are list of German cars");
				}else if (i==2) {
					System.out.println("These are list of Korean cars");
				}else {
					System.out.println("These are Italian cars");
				}
				for(int c=0; c<cars[i].length; c++) {
				System.out.println(cars[i][c]+" ");
			}System.out.println();
		
		
	}
			int[][] a = {
					{5,2,3,7},
					{1,5,2,2},
					{1,2,3,4}
				};
				
		     //should print 10
		     
		  
		
	}
}