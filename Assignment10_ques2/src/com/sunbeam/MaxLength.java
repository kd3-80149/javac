package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MaxLength {
	public static void main(String[] args) {
		
	
	List<String>list=new ArrayList<>();
	Collections.addAll(list,"Anita","someone_else","Ritu","Payal","Sudhanshu");
	System.out.println(" List: " + list);
	StringComparator com=new StringComparator();
	
	String str = Collections.max(list,com);
	System.out.println("Max Val: " + str);
	}
}
