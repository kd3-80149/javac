// Q4 pattern(c)

public class pattern3 {

	public static void main(String[] args) {
		int rows = 6; // Number of rows in the pattern

		// Outer loop for the number of rows
		for (int i = 1; i <= rows; i++) {
			// Inner loop for printing asterisks in each row
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}
}
