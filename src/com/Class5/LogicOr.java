package com.Class5;

public class LogicOr {

	public static void main(String[] args) {
		/*weekday is equal day 1 to day 5
		 * weekend is equal day 6 and day 7
		 */
		int day=3;
		//false or 	false or true or	false	or false
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("Is a weekday");
			//false or 	false
		}else if (day==6 || day==7) {
			System.out.println("is a week end");
		}else {
			System.out.println("Not a valid day");
		}

	}

}
