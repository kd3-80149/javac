package com.sunbeam.assignment03;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	void acceptDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day = ");
		day= scanner.nextInt();
		System.out.println("Enter month = ");
		month= scanner.nextInt();
		System.out.println("Enter year = ");
		year= scanner.nextInt();
		
		scanner.close();
	}
	
	void displayDate() {
		System.out.println("Date : "+day+"/"+month+"/"+year);
	}

}
