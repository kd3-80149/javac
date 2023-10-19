package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class BookMain {

	public static void main(String[] args) {
		class BookComparator implements Comparator<Book3>
		{

			@Override
			public int compare(Book3 b1, Book3 b2) {
				int diff=Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
			
		}
		BookComparator bookComp=new BookComparator();
		
	TreeSet<Book3>set=new TreeSet<Book3>(bookComp);
    set.add(new Book3("H5",89.0,"JK Rolling",2));
    set.add(new Book3("H2",35.0,"John keats",3));
    set.add(new Book3("H2",55.0,"Chetan",4));
    set.add(new Book3("H4",100.0,"Amish",1));
    set.add(new Book3("H1",50.0,"Durjoy",5));
   
    System.out.println("Display all books in Forward Order......");
    Iterator<Book3>itr=set.iterator();
    while(itr.hasNext())
    {
    	Book3 b=itr.next();
    	System.out.println(b);
    }
    System.out.println("-------------------------------------------------------\n");	
    System.out.println("Display all books in Reverse Order......");
    Iterator<Book3>itr1=set.descendingIterator();
    while(itr1.hasNext())
    {
    	Book3 str=itr1.next();
    	System.out.println(str);
    }	
    
	}

// Output----------->we can't use comparable and comparator Interface together........... ....



}

	


