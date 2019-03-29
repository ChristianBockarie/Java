package com.Class12;

public class EnhancedForEachLoopIn2D {

	public static void main(String[] args) {

			//int numbers[] = {1,2,3,4,5,6,7,8,9,10};
			//for(dataType iteratorVariable : IterableObject){
			//for (int count : numbers){
				//System.out.println("Count is : "+count);
			//}
			
			/*Create a grocery list:fruits{}
			 * 						veggies{}
			 * 						dairy{}
			 * Retrieve all values using 2 different loops 
			 */

			String[][] groceryList = {
					{"Banana", "Apple", "Orange"},
					{"spinach", "lettuce", "blackolives"},
					{"butter", "cheese", "milk",}
					};
			
			for (String[] singleArray:groceryList) {
				if (singleArray.equals(groceryList[0])) {  
					System.out.println("These are fruits");
				}else if (singleArray.equals(groceryList[1])) {
					System.out.println("These are veggies");
				}else {
					System.out.println("These are dairy");
				}
				for(String list:singleArray) {
					System.out.println(list + " ");
		}
				System.out.println();
			}
			
	}
}
