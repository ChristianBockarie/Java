package com.class4;

public class MortgageRateandPrice {

		public static void main(String[] args) {
			/*create a java program and store variables to store mortgage rate and price.
			 * if rate is higher than 4.5 user will not buy a house
			 * 							otherwise user will continue buying.
			 * once decides to buy a house, if price of the house is larger than 200,000 then user will take a loan
			 * 							otherwise user will pay cash
			 */;
		double expectedRate=4.5;
		int expectedPrice=200000;
		
		
		if (expectedRate>4.5) {
			System.out.println("Will NOT buy House");
		}else {
			System.out.println("Decides to buy the house");
			if (expectedPrice>200000) {
				System.out.println("Take a loan");
			}else {
				System.out.println("Paying Cash");
			}
 }
}
}		
