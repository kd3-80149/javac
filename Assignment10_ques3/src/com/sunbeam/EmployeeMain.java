package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee e1;
		int index;

		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				e1 = new Employee();
				e1.accept(sc);
				list.add(e1);
				break;
			case 2:
				for (Employee ele : list)
					System.out.println(ele);

				break;

			case 3:
				System.out.println("Enter index at which element to be deleted : ");
				index = sc.nextInt();
				list.remove(index);
				break;
			case 4:
				System.out.println("Enter id for search...");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setId(id);

				if (list.contains(key))
					System.out.println("Found..");
				else
					System.out.println("Not Found..");
				break;
			case 5:

				CustomComparator cm = new CustomComparator();

				Collections.sort(list, cm);

				System.out.println("After Sort by student: ");
				for (Employee ele : list)
					System.out.println(ele);
				break;
			case 6:
				System.out.println("Enter emp id to be modified: ");
				id = sc.nextInt();
				Employee key1 = new Employee();
				key1.setId(id);
				index = list.indexOf(key1);
				if (index == -1)
					System.out.println("Employee not found.");
				else {
					Employee oldEmp = list.get(index);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp = new Employee();
					newEmp.accept(sc);
					list.set(index, newEmp);
				}
				break;
			}

		} while (choice != 0);

	}
}
