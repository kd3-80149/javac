package com.sunbeam.assignment01;

import java.util.Scanner;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;

	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	void acceptInvoiceInfo() {
		// if qty <0 then set qty=0;
		// if price < 0 then set price=0.0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter part number = ");
		partNumber = scanner.nextLine();
		
		System.out.println("Enter part description = ");
		partDescription = scanner.nextLine();
		
		System.out.println("Enter quantity = ");
		if (quantity > 0) {
			quantity = scanner.nextInt();
		} else {
			setQuantity(0);
		}

		System.out.println("Enter price = ");
		if (price >= 0) {
			price = scanner.nextDouble();
		} else {
			setPrice(0.0);
		}
		
		scanner.close();
	}

	double calculateInvoiceAmt() {
		double totalAmt = 0;
		
		totalAmt = quantity * price;
		
		return totalAmt;
	}

	void displayInvoiceInfo() {
		System.out.println("part number = "+partNumber);
		System.out.println("part description = "+partDescription);
		System.out.println("quantity = "+quantity);
		System.out.println("price = "+price);
		System.out.println("--------------------------");
		double totalAmt = calculateInvoiceAmt();
		System.out.println("total = "+totalAmt);
	}

}
