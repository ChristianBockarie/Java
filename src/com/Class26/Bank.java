package com.Class26;

public class Bank {
	public int getBalance(int balance) {
		System.out.println("Balance : "+ balance);
		return 0;
	}
}
class BankA extends Bank {
	public int getBalance() {
		System.out.println("Balance : $ " + 1000);
		return 1000;
	}
}
class BankB extends Bank {
	public int getBalance() {
		System.out.println("Balance : $ " + 1500);
		return 1500;
	}
}
class BankC extends Bank {
	public int getBalance() {
		System.out.println("Balance : $ "+2000);
		return 2000;
	}
}