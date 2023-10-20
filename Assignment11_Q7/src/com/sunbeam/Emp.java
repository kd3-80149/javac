package com.sunbeam;

public interface Emp {
	double getSal();
	default double calcIncentives()
	{
		return 0.0;
		
	}
	
	static double calcTotalIncome(Emp arr[])
	{
		double income = 0.0;
		for(Emp e1 : arr) {
			income += e1.getSal()+e1.calcIncentives();
			
		}
		return income;
	
		
	}

}
