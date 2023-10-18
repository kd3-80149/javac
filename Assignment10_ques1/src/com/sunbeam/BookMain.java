package com.sunbeam;
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
//6. Reverse the list (hint - Collections.reverseList())package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<>();
		Book bk;
		
		 String isbn1;
		int choice;
		int index = 0;

		do {
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				bk = new Book();
				bk.accept(sc);	
				
				if (list.contains(bk)) {
					index=list.indexOf(bk);
					 Book b=list.get(index);
					b.setQuantity(b.getQuantity()+1);
					System.out.println(b.getQuantity());
				} else{
					list.add(bk);
				}
				break;
				
	
			case 2:
			
				ListIterator<Book> itr=list.listIterator();
				while (itr.hasNext()) {
					Book book = itr.next();
					System.out.println(book);
				}
				break;			
				case 3:
				System.out.println("Enter index of book to search...");
				index= sc.nextInt();
				 bk=list.get(index);
				
					System.out.println(bk);
				break;

			case 4:
				System.out.println("Enter index to be delete...");
				index = sc.nextInt();
				list.remove(index);

				break;

			case 5:
				System.out.println("Enter isbn to delete :");
				isbn1= sc.next();
				Book key = new Book();
				key.setIsbn(isbn1);
				if (list.contains(key)) {
					int b1= list.indexOf(key);
					list.remove(b1);
				}
				break;
			case 6:
				//System.out.println("Reverse the order of books...");
				Collections.reverse(list);
				for(Book b:list)
				System.out.println(b);
				break;
			}

		} while (choice != 0);

	}
}
