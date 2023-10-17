package com.sunbeam;

public class Date implements Displayable {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	// public Date(int day2, int month2, int year2) {
		// TODO Auto-generated constructor stub
	//}
	@Override
	    public void show() {
	        System.out.println("Date: " + day);
	        System.out.println("Date: "+month);
	        System.out.println("Date:"+year);

}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	 
}
