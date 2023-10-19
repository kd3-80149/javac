package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookTreeMain {

	public static void main(String[] args) {
		
		 TreeSet<Book2>set=new TreeSet<>();
		    set.add(new Book2("H5",89.0,"JK Rolling",2));
		    set.add(new Book2("H2",35.0,"John keats",3));
		    set.add(new Book2("H2",55.0,"Chetan",4));
		    set.add(new Book2("H4",100.0,"Amish",1));
		    set.add(new Book2("H1",50.0,"Durjoy",5));
		   
		    System.out.println("Display all books details");
		    Iterator<Book2>itr=set.iterator();
		    while(itr.hasNext())
		    {
		    	Book2 b=itr.next();
		    	System.out.println(b);
		    }
		    
			}


	}


