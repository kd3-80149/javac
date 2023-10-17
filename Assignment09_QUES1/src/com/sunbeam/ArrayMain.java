package com.sunbeam;

public class ArrayMain {

	public static void main(String[] args) {
		
		

		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		ArrayMethod m=new ArrayMethod();
		
		
		Integer min1 = m.findmin(arr1);
		System.out.println("Minimum value "+min1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = m.findmin(arr2);
		System.out.println("Minimum value "+min2);
	}

}
