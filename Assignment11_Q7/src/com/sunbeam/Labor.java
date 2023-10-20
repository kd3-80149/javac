
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
