package com.sunbeam;

public class ArrayTest {

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
		Integer[] arr= {10,35,45,67,89,32,56,78,89,99};
		Integer key=67;
		int cnt=countIf(arr, key, (p,q)->p>q);
		System.out.println("Count : "+cnt);
		

	}

}
