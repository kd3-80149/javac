package com.sunbeam;

import java.util.Scanner;

public class DoubleArray {
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int cnt=0;
		for(T ele:arr)
		{
			if(c.compare(ele,key))
				cnt++;
		}
		return cnt;
		
	}
	public static void main(String[] args) {
		
		Double[]arr= {1.4,2.3,5.6,7.8,9.0,5.6,2.4,10.0,3.3,5.6,7.8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key :");
		
		double key=sc.nextDouble();
		
		int cnt=countIf(arr, key,(a,b)->a.equals(b));
		System.out.println("count :"+cnt);
		

	}

}
