package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CountMain {
	
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for(String str: arr) {
		if(cond.test(str))
		count++;
		}
		return count;
		}
	
	

	public static void main(String[] args) {
		String[]arr= {"Anita","Shudhanshu","Saarthak","Ritu","Rohan","Rutuja","Rucha"};
	
	
		
	int result=	countIf(arr,ele->ele.length()>6);
	System.out.println("Result : "+result);
		
	}
	
	

}
