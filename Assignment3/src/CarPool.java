
//Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.
import java.util.*;

public class CarPool {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalMiles;
		int perGallonCost;
		int milesPerGallon;
		int parkingFees;
		int tollsPerDay;
		int userDailyCost;
		System.out.println("Application that calculate daily driving cost...");
		System.out.println("Enter total miles driven per day=");
		totalMiles = sc.nextInt();
		System.out.println("Enter cost per gallon of gasoline=");
		perGallonCost = sc.nextInt();
		System.out.println("Enter the average miles per gallon=");
		milesPerGallon = sc.nextInt();
		System.out.println("Enter the parking fees per day=");
		parkingFees = sc.nextInt();
		System.out.println("Enter the tolls per day=");
		tollsPerDay = sc.nextInt();
		userDailyCost = (totalMiles / milesPerGallon) * perGallonCost + parkingFees + tollsPerDay;
		System.out.println("user's cost per day of driving to work =" + userDailyCost);
	}

}
