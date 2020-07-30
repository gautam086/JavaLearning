package Chapter2;

import java.util.Scanner;

public class ProductOf3Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z;
		int res;
		System.out.print("Enter the first number:");
		x = sc.nextInt();
		System.out.print("Enter the second number:");
		y = sc.nextInt();
		System.out.print("Enter the third number:");
		z = sc.nextInt();
		res = x * y * z;
		System.out.printf("product is: %d%n", res);

		sc.close();
	}

}
