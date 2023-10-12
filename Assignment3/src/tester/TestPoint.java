package tester;

import java.util.Scanner;

import com.sunbeam.geometry.*;

public class TestPoint {

	public static void main(String[] args) {
		int numberOfPoints;
		int choice;
		int index = 0;
		int z = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number of points");
		numberOfPoints = sc.nextInt();

		Point2D[] p = new Point2D[numberOfPoints];

		for (int i = 0; i < numberOfPoints; i++) {
			System.out.println("Please enter the x co-ordinates of " + (i + 1) + "point : ");
			Double x = sc.nextDouble();
			System.out.println("Please enter the y co-ordinates of " + (i + 1) + "point : ");
			Double y = sc.nextDouble();
			p[i] = new Point2D(x, y);
		}
		do {
			System.out.println("*******Menu*******");
			System.out.println("1.Display details of the specific project.");
			System.out.println("2.Display x, y co-ordinates of all points.");
			System.out.println("3.Display distance between specified points.");
			System.out.println("4.Exit.");
			System.out.println("Please enter your choice.");
			choice = sc.nextInt();
			System.out.println("*********************************************");

			switch (choice) {
			case 1:
				System.out.println("Please enter the index");
				index = sc.nextInt();

				if (0 <= index && index < numberOfPoints) {
					System.out.println("Point Details" + p[index].getDetails());
				} else {
					System.out.println("Invalid Index, please retry.");
				}
				break;

			case 2:
				for (Point2D point2d : p) {
					System.out.println(point2d.getDetails());
				}
				break;

			case 3:
				System.out.println("Please enter the starting index");
				int startPoint = sc.nextInt();
				System.out.println("Please enter the ending index");
				int endpoint = sc.nextInt();

				if ((startPoint >= 0 && startPoint < numberOfPoints) && (endpoint >= 0 && endpoint < numberOfPoints)) {
					double distance = p[startPoint].calculate_distance(p[endpoint]);
					System.out.println("Both points are located at different positions.");
					System.out.println(
							"Distance between Point " + startPoint + " and Point " + endpoint + " : " + distance);

				} else if (p[startPoint].isEqual(p[endpoint])) {
					System.out.println("Both points are located at the same position.");
				} else {
					System.out.println("Invalid indices.");
				}
				break;

			case 4:
				System.out.println("Exiting Program.");
				return;

			default:
				System.out.println("Invalid Choice. Please enter correct choice from Menu.");
				break;
			}

		} while (choice < 5);
		System.out.println("Thank You for using the application.");
	}

}
