package com.sunbeam.credit;

public class limitCalculatorTest {

	public static void main(String[] args) {
		
		creditCalculator c=new creditCalculator (12345,1000,300,400,1500);
		int newBalance=c.newBalance();
		if(newBalance<=c.getCreditLimit())
		{
			System.out.println("new balance="+newBalance);
			
		}
		else
		{
			System.out.println("Credit limit Exceeded...");
		}
		
	
		
			
		

	}

}
