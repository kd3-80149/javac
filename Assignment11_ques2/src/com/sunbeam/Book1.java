
//	2. In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, what will happen? Books are stored in which order?
	package com.sunbeam;

	import java.util.Objects;
	import java.util.Scanner;

	public class Book1 {
		private String isbn;
		private double price;
		private String authorName;
		private int quantity;

		public Book1() {

		}

		public Book1(String isbn, double price, String authorName, int quantity) {
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
		public int hashCode() {
			return Objects.hash(isbn);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book1 other = (Book1) obj;
			return Objects.equals(isbn, other.isbn);
		}

		@Override
		public String toString() {
			return "BookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
					+ quantity + "]";
		}
	}

	


