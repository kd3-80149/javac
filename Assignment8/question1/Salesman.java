package com.sunbeam.info;

import java.util.Scanner;

public class Salesman extends Employee{
	
	private double comm;

Salesman(){
	this.comm= 0.4;
	}

	
	    public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public double calculateSal() {
		
		return super.getSalary()*this.comm;
	}


	@Override
	public String toString() {
		return super.toString()+ "Salesman [comm=" + comm + "]";
	}

	

}
