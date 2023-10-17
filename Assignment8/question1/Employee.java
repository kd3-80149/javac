package com.sunbeam.info;

import java.util.Scanner;

abstract public class Employee extends Person {

	private int id;
	private double salary;

	Employee() {

		this.id = 101;
		this.salary = 15000;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

//	public void display()
//	{
//		System.out.println("Employee id="+this.id);
//		System.out.println("Employee salary="+this.salary);
//	}

	abstract public double calculateSal();

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

}
