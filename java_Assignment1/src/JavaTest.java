
//Q1. Accept a integer number and when the program is executed print the binary, octal and
//hexadecimal equivalent of the given number.
//Sample Output:
//java Test
//Enter Number : 20
//Given Number :20
//Binary equivalent :10100
//Octal equivalent :24
//Hexadecimal equivalent :14
import java.util.*;

public class JavaTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number=");
		num = sc.nextInt();
		System.out.println("Binary equivalent=" + Integer.toBinaryString(num));
		System.out.println("octal equivalent=" + Integer.toOctalString(num));
		System.out.println(" hexadecimal equivalent=" + Integer.toHexString(num));
	    sc.close();
	}
        
}
