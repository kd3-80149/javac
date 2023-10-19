package com.sunbeam;

import java.util.Comparator;
import java.util.Objects;

public class Book2 implements Comparable<Book2>{
	
		private String isbn;
		private double price;
		private String authorName;
		private int quantity;

		public Book2() {

		}

		public Book2(String isbn, double price, String authorName, int quantity) {
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



		@Override
		public String toString() {
			return "BookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
					+ quantity + "]";
		}

		@Override
		public int compareTo(Book2 other) {
			int diff=this.isbn.compareTo(other.isbn);
			return diff;
		}

		
	}

    

