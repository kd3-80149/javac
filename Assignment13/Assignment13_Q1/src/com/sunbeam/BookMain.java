package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BookMain {
	public static void WriteBook(List<Book>list)
	{
		try(FileOutputStream fout=new FileOutputStream("Book.bin")){
			try(DataOutputStream dout=new DataOutputStream(fout)){
				for(Book b:list)
				{
					dout.writeUTF(b.getIsbn());
					dout.writeDouble(b.getPrice());
					dout.writeUTF(b.getAuthorName());
					dout.writeInt(b.getQuantity());
				}//dout close
			}// fout close
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(" Save Books ");
	}
	public static void ReadBook()
	{
		try(FileInputStream fin=new FileInputStream("Book.bin")){
			try(DataInputStream din=new DataInputStream(fin))
			{
				while(true)
				{
					Book b3=new Book();
					b3.setIsbn(din.readUTF());
					b3.setPrice(din.readDouble());
					b3.setAuthorName(din.readUTF());
					b3.setQuantity(din.readInt());
					System.out.println(b3);
				}
			}//din close
			
		}//fin close
		catch(EOFException e1)
		{
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<>();
		Book bk;
		
		 String isbn1;
		int choice;
		int index = 0;
	
		do {
			System.out.println("1.Add book\n2.Display Book\n3.Search book\n4.Delete index\n5.Delete book\n6.Sorting\n7.Save books\n8.Load books");
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
			case 7:
				
				WriteBook(list);
				
			case 8:
				
				ReadBook();
				//System.out.println();
			}
			

		} while (choice != 0);
         //ReadBook();
	}

	
}