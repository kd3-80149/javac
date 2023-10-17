package com.sunbeam.info;

import java.util.Scanner;

public class Manager extends Employee {

	private double bonus;

	Manager() {
		this.bonus = 4000;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calculateSal() {
		// super.calculateSal
		// System.out.println("Total salary of manager ="+(super.getSalary()+
		// this.bonus));
		return super.getSalary() + this.bonus;
	}

	@Override
	public String toString() {
		return super.toString()+"Manager [bonus=" + bonus + "]";
	}

}
