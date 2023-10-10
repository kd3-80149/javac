package com.sunbeam.assignment02;

import java.util.Scanner;

public class Employee {

	private String firstName;
	private String lastName;
	private double sal;

	public Employee(String firstName, String lastName, double sal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sal = sal;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	void acceptEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name = ");
		firstName = scanner.nextLine();
		System.out.println("Enter last name = ");
		lastName = scanner.nextLine();
		System.out.println("Enter salary = ");
		if (sal >= 0) {
			sal = scanner.nextDouble();
		} else {
			setSal(0.0);
		}
	}

	void displaySal() {
		System.out.println("yearly salary = " + (sal * 12));
	}

	double raise() {
		Scanner scanner = new Scanner(System.in);
		double num = 10;
		System.out.println("Enter percentage to increament salary = ");
		num = scanner.nextDouble();
		double percentage = (num / 100) * sal;
		double inc = (percentage + (sal * 12));
		System.out.println("Salary after raise = " + inc);
		return inc;
	}

}
