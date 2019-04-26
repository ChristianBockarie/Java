package com.Class28;

public interface Bank {

	void hasChecking();

	void hasSavings();

	void hasCreditCard();
}

class BOA implements Bank {
	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking account");
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 Savings account");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different cc accounts");
	}
}

class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("PNC has 2 Savings account");
	}
	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 Checking account");
	}
	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different cc account");
	}
	
}
