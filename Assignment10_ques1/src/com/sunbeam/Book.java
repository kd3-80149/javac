//1. Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven program to
//1. Add new book in List
//If book not present, then add a new book (hint - contains())
//If book is present, increment its quantity.
//2. Display all books in forward order using random access
//3. Search a book with given isbn (hint - indexOf())
//4. Delete a book at given index.
//5. Delete a book with given isbn.
//6. Reverse the list (hint - Collections.reverseList())

package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {

	}

	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void accept(Scanner sc) {
		sc.nextLine();
		System.out.print("Enter isbn: ");
		this.isbn = sc.nextLine();
		System.out.print("Enter Price: ");
		this.price = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter author name: ");
		this.authorName = sc.nextLine();
		System.out.print("Enter quantity: ");
		this.quantity = sc.nextInt();

	}

	



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "BookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
				+ quantity + "]";
	}
}
