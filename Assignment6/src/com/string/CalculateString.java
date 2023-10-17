package com.string;

import java.util.Scanner;

public class CalculateString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String   s= sc.nextLine();
		System.out.println(s);
		try {
		if(s.length()>8)
			throw new ExceptionLineTooLong();
			System.out.println("Length of string "+s+"="+s.length());
		}catch(ExceptionLineTooLong e) {
		System.out.println("The strings is too long");
		}
		
//		if(s.length()>8)
//			throw new ExceptionLineTooLong();



	}

}


	

