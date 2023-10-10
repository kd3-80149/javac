package com.sunbeam.assignment01;

public class Hardware {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("_", "_", 10, 0.0);

		invoice.acceptInvoiceInfo();
		invoice.calculateInvoiceAmt();
		invoice.displayInvoiceInfo();

	}
}
