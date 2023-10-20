package com.sunbeam;

import java.util.Scanner;

public class Manager implements Emp {
	double basicSalary;
	double dearanceAllowance;
	
	

	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		

		return basicSalary + dearanceAllowance;
	}

	public double calcIncentives() {
		return 0.2 * basicSalary;
	}

}
