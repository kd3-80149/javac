package com.sunbeam.info;

import java.util.Scanner;

public class Person {
	protected String name;
	private int age;
	Scanner sc = new Scanner(System.in);

	public Person() {
		this.name = "Anu";
		this.age = 15;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
