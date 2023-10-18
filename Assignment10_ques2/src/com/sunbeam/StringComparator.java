package com.sunbeam;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		int differ= arg0.length()- arg1.length();
		return differ;
	}


	

}
