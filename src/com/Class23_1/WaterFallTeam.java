package com.Class23_1;

import com.Class23.Employee;

public class WaterFallTeam extends Employee {

	public static void main(String[] args) {
		
		WaterFallTeam wt = new WaterFallTeam();
		wt.salary1=90000;//can access protected values from different package through inheritance
		//wt.salary;default values cannot be accessed in different package
		
		wt.test();//available cause its protected
		//wt.test1();Not available cause its a default
	}
	
}
