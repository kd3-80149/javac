//1. Create an interface Emp with abstract method double getSal() and a default method default double calcIncentives(). The default method
//simply returns 0.0. Create a class Manager (with ﬁelds basicSalary and dearanceAllowance) inherited from Emp. In this class override getSal() method
//(basicSalary + dearanceAllowance) as well as calcIncentives() method (20% of basicSalary). Create another class Labor (with ﬁelds hours and rate)
//inherited from Emp interface. In this class override getSal() method (hours * rate) as well as calcIncentives() method (5% of salary if hours > 300,
//otherwise no incentives). Create another class Clerk (with ﬁeld salary) inherited from Emp interface. In this class override getSal() method (salary). Do
//not override, calcIncentives() in Clerk class. In Emp interface create a static method static double calcTotalIncome(Emp arr[]) that calculate
//total income (salary + incentives) of all employees in the given array.

package com.sunbeam;

import java.util.Scanner;

public class Labor implements Emp{
  int hours;
  double rate;
  
public Labor(int hours, double rate) {
	super();
	this.hours = hours;
	this.rate = rate;
}
@Override
public double getSal() {
	
   return hours*rate;
}
public double calcIncentives() {
	if(hours>300) 
	 return 0.05*getSal();
	else
		return 0.0;
	
}
}
