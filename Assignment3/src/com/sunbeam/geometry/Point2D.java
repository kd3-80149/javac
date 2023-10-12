package com.sunbeam.geometry;
import java.util.Scanner;
public class Point2D 
{
	private double x;
	private double y;

	public Point2D(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}

	public String getDetails() 
	{
		return "Point(" + x + "," + y + ")" ;	
	}

	Point2D p2;
	public boolean isEqual(Point2D p2)
	{
		return this.x == p2.x && this.y == p2.y; 
	}

	double dist_x;
	double dist_y;

	public double calculate_distance(Point2D p2) 
	{
		dist_x = this.x - p2.x;
		dist_y = this.y - p2.y;
		return Math.sqrt(  (dist_x * dist_x) + ( dist_y * dist_y)   );
	}	
}