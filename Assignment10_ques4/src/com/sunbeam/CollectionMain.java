package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>(); // output B, D, A, C, null, null, null
		//Collection<String> c = new HashSet<>();    //output [null, A, B, C, D]
		//Collection<String> c = new LinkedHashSet<>();  //output  [B, D, A, C, null]
		//Collection<String> c = new TreeSet<>();  // output  Exception in thread "main" java.lang.NullPointerException
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
