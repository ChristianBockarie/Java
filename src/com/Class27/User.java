package com.Class27;

public class User {
	public String name;
	public long mobileNumber;

	public User(String name, long mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
}

class UserInfo extends User {
	public String address;

	public UserInfo(String name, long mobileNumber, String address) {
		super(name, mobileNumber);
		this.address = address;
	}

	public void userDetails() {
		System.out.println(
				"User name is " + name + " and phone number is " + mobileNumber + " and address is " + address);
	}
}