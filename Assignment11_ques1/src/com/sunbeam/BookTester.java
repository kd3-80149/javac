package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class BookTester {

	public static void main(String[] args) {
		
    Set<Book>set=new HashSet<>();
    set.add(new Book("H5",89.0,"JK Rolling",2));
    set.add(new Book("H2",35.0,"John keats",3));
    set.add(new Book("H2",55.0,"Chetan",4));
    set.add(new Book("H4",100.0,"Amish",1));
    set.add(new Book("H1",50.0,"Durjoy",5));
   
    System.out.println("Display all books details");
    Iterator<Book>itr=set.iterator();
    while(itr.hasNext())
    {
    	Book b=itr.next();
    	System.out.println(b);
    }
    
	}

}
// without hashcode output
//Display all books details
//BookDetails [isbn=H1, price=50.0, authorName=Durjoy, quantity=5]
//BookDetails [isbn=H5, price=89.0, authorName=JK Rolling, quantity=2]
//BookDetails [isbn=H4, price=100.0, authorName=Amish, quantity=1]
//BookDetails [isbn=H2, price=35.0, authorName=John keats, quantity=3]
//BookDetails [isbn=H2, price=55.0, authorName=Chetan, quantity=4]
