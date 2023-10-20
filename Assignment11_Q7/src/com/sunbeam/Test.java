package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		Emp[] arr=new Emp[3];
		arr[0]=new Manager(50000.0,4000);
		arr[1]=new Labor(5,4);
		arr[2]=new Clerk(2000);
		double total=Emp.calcTotalIncome(arr);
		System.out.println("Total income :"+total );
		

	}

}
