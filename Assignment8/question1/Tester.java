package com.sunbeam.info;

public class Tester {

	public static void main(String[] args) {
		Box<Manager> b1 = new Box<>();
		b1.setObj(new Manager());
		System.out.println("Emp1 = " + b1.getObj());
		System.out.println("Emp1 = " + b1.getTotalSalary());
		System.out.println(".............................");

		Box<Salesman> b2 = new Box<>();
		b2.setObj(new Salesman());
		// double totalSalary = b2.getTotalSalary();
		System.out.println("Emp2 = " + b2.getObj());
		System.out.println("Emp2 = " + b2.getTotalSalary());
		System.out.println(".............................");
	}

}
