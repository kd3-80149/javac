package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class BookLinkedMain {

	public static void main(String[] args) {
		Set<Book1> set = new LinkedHashSet<>();
		set.add(new Book1("H7", 89.0, "JK Rolling", 2));
		set.add(new Book1("H8", 105.0, "Tripathi", 3));
		set.add(new Book1("H4", 55.0, "Chetan", 4));
		set.add(new Book1("H4", 100.0, "Premchand", 1));
		set.add(new Book1("H1", 50.0, "Mahadevi", 5));

		System.out.println("Display all books details");
		Iterator<Book1> itr = set.iterator();
		while (itr.hasNext()) {
			Book1 b = itr.next();
			System.out.println(b);
		}

	}

}
//without  hashcode output
//Display all books details
//BookDetails [isbn=H7, price=89.0, authorName=JK Rolling, quantity=2]
//BookDetails [isbn=H8, price=105.0, authorName=Tripathi, quantity=3]
//BookDetails [isbn=H4, price=55.0, authorName=Chetan, quantity=4]
//BookDetails [isbn=H4, price=100.0, authorName=Premchand, quantity=1]
//BookDetails [isbn=H1, price=50.0, authorName=Mahadevi, quantity=5]
