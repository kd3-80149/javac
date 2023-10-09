//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first double value: ");
		if (scanner.hasNextDouble()) {
			double num1 = scanner.nextDouble();

			System.out.print("Enter second double value: ");
			if (scanner.hasNextDouble()) {
				double num2 = scanner.nextDouble();
				double average = (num1 + num2) / 2;
				System.out.println("Average of the two double values: " + average);
			} else {
				System.out.println(" Second input is not a double value.");
			}
		} else {
			System.out.println(" First input is not a double value.");
		}

		scanner.close();
	}
}
