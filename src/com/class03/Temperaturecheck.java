package com.Class03;

public class Temperaturecheck {

	public static void main(String[] args) {
		int temp = 32;
		// above 32 temperature is high
		//temperature is cold below 32
		boolean freeze = 31 < 32;
		boolean hotter = 31 > 32;

		System.out.println(freeze);
		System.out.println(hotter);

		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp);
		}

	}

}
