package com.sunbeam;

import java.util.Scanner;

public class ArithmeticMain {
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double num1, num2;
		do {
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter num1:");
				num1 = sc.nextDouble();
				System.out.println("Enter num2:");
				num2 = sc.nextDouble();
				calculate(num1, num2, (x, y) -> x + y);
				break;
			case 2:
				System.out.println("Enter num1:");
				num1 = sc.nextDouble();
				System.out.println("Enter num2:");
				num2 = sc.nextDouble();
				calculate(num1, num2, (x, y) -> x - y);
				break;
			case 3:
				System.out.println("Enter num1:");
				num1 = sc.nextDouble();
				System.out.println("Enter num2:");
				num2 = sc.nextDouble();
				calculate(num1, num2, (x, y) -> x * y);
				break;
			case 4:
				System.out.println("Enter num1:");
				num1 = sc.nextDouble();
				System.out.println("Enter num2:");
				num2 = sc.nextDouble();
				calculate(num1, num2, (x, y) -> x / y);
				break;

			}

		} while (choice != 0);

	}

}
