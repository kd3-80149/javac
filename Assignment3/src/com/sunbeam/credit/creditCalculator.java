//Q1. (Credit Limit Calculator
//Develop a Java application that determines whether any of several department-store customers has
//exceeded the credit limit on a charge account.
//For each customer,the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning
//balance+ charges – credits), display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//program should display the message "Credit limit exceeded
//
package com.sunbeam.credit;
//import java.util.*;
public class creditCalculator {

	 
		
		private int accNumber;
		private int begBalance;
		private int charges;
		private int creditPaid;
		private int creditLimit;
		//private int newBalance;
		
		public creditCalculator(int accNumber, int begBalance, int charges, int creditPaid, int creditLimit)
		{
			
			this.accNumber = accNumber;
			this.begBalance = begBalance;
			this.charges = charges;
			this.creditPaid = creditPaid;
			this.creditLimit = creditLimit;
			//this.newBalance = newBalance;
		}
		
		
	 
		

		public int getCreditLimit() {
			return creditLimit;
		}
		public void setCreditLimit(int creditLimit) {
			this.creditLimit = creditLimit;
		}

	int newBalance()
	{
		 int newBalance=0;
		 newBalance=begBalance+charges-creditPaid;
		 return newBalance;
		 
		 
	}
         
	
	}


