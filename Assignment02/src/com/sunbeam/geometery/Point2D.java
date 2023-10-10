package com.sunbeam.geometery;

public class Point2D {

	private double xCoord;
	private double yCoord;

	public Point2D(double xCoord, double yCoord) {
		// TODO Auto-generated constructor stub
		this.xCoord=xCoord;
		this.yCoord=yCoord;
	}


	public void stringForm(Point2D p2) {
		// TODO Auto-generated method stub
		 String str = "";
         System.out.println("String form = "+(str =
        		 String.valueOf(p2.xCoord)));
         System.out.println("String form = "+(str =
        		 String.valueOf(p2.yCoord)));
	}

	public boolean isEqual(Point2D p2) {
		// TODO Auto-generated method stub
		if(this.xCoord==p2.xCoord && this.yCoord==p2.yCoord) {
            return true;
        }else {
            return false;
        }
	}

	public double calculateDistance(Point2D p2) {
		// TODO Auto-generated method stub
		double res;
        res = Math.sqrt(Math.pow((this.xCoord-p2.xCoord),2)+Math.pow((this.yCoord-p2.yCoord),2));

        return res;
	}

}
