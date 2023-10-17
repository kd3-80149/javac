package com.app.geometry;
import java.util.Scanner;

public class Point2D {
	int x;
	int y;

	public Point2D() {
		this(0, 0);
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void acceptPoint() {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the details of x & y co-ordinates");
		System.out.println("Enter x_axis");
		this.x = sc.nextInt();
		System.out.println("Enter y_axis");
		this.y = sc.nextInt();

	}

	public void displayPoint() {

		//System.out.println("Enter x_axis");

		System.out.println("Point2D [x=" + x + ", y=" + y + "]");

	}

	public String getDetails() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	public boolean isEqual(Point2D p) {

		return this.x == p.x && this.y == p.y;
	}

	public double calculateDistance(Point2D point) {
		
		 return Math.sqrt(Math.pow((point.x-x),2)+Math.pow((point.y-y),2));
	}


}
