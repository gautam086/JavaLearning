package Chapter2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int num1 = sc.nextInt();
		System.out.print("Enter the number");
		int num2 = sc.nextInt();
		System.out.printf("Sum of two number is:%d%n", (num1+num2));
		System.out.printf("Difference of two number is:%d%n", (num1-num2));
		System.out.printf("Product of two number is:%d%n", (num1*num2));
		System.out.printf("Division of two number is:%d%n", (num1/num2));
	}

}
