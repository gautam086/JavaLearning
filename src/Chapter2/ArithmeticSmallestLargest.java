package Chapter2;

import java.util.Scanner;

public class ArithmeticSmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int x = sc.nextInt();
		System.out.print("Enter the number:");
		int y = sc.nextInt();
		System.out.print("Enter the number:");
		int z = sc.nextInt();

		System.out.printf("Sum of numbers is:%d%n", (x + y + z));
		System.out.printf("Average of numbers is:%d%n", ((x + y + z) / 3));

		int largest = x;

		if (y > largest) {
			largest = y;
		}
		if (z > largest) {
			largest = z;
		}

		int smallest = x;

		if (y < smallest) {
			smallest = y;
		}
		if (z < smallest) {
			smallest = z;
		}
		System.out.printf("THe largest number is:%d%nThe smallest number is:%d%n", largest,smallest);
	}

}
