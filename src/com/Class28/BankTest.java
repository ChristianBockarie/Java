package com.Class28;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank = new BOA();
		bank.hasChecking();
		bank.hasSavings();
		bank.hasCreditCard();
		
		Bank bank2 = new PNC();
		bank2.hasChecking();
		bank2.hasSavings();
		bank2.hasCreditCard();
	}

}
