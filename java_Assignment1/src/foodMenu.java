
//Q3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.
import java.util.*;

public class foodMenu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double dosaPrice = 5.50;
		double samosaPrice = 6.7;
		double idliPrice = 8.5;
		double momosPrice = 9.5;
		double vadapaavPrice = 10.5;
		int totalBill = 0;
		while (true) {
			// Display menu
			System.out.println("Menu:");
			System.out.println("1. Dosa - " + dosaPrice);
			System.out.println("2. Samosa - " + samosaPrice);
			System.out.println("3. Idli - " + idliPrice);
			System.out.println("4. momos - " + idliPrice);
			System.out.println("5. vadapaav - " + idliPrice);

			System.out.println("6. Generate Bill");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter quantity: ");
				int dosaQuantity = sc.nextInt();
				totalBill += dosaPrice * dosaQuantity;
				break;
			case 2:
				System.out.print("Enter quantity: ");
				int samosaQuantity = sc.nextInt();
				totalBill += samosaPrice * samosaQuantity;
				break;
			case 3:
				System.out.print("Enter quantity: ");
				int idliQuantity = sc.nextInt();
				totalBill += idliPrice * idliQuantity;
				break;
			case 4:
				System.out.print("Enter quantity: ");
				int momosQuantity = sc.nextInt();
				totalBill += momosPrice * momosQuantity;
				break;
			case 5:
				System.out.print("Enter quantity: ");
				int vadapaavQuantity = sc.nextInt();
				totalBill += vadapaavPrice * vadapaavQuantity;
				break;

			case 6:
				System.out.println("Total Bill: " + totalBill);
				sc.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
                     
	}

}   
