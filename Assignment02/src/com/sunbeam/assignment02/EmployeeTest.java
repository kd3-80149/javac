package com.sunbeam.assignment02;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("", "", 0.0);

		e1.acceptEmployee();
		e1.displaySal();
		e1.raise();

		Employee e2 = new Employee("", "", 0.0);

		e2.acceptEmployee();
		e2.displaySal();
		e2.raise();

	}

}
