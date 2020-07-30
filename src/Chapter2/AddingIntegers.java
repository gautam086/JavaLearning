package Chapter2;

import java.util.Scanner;

public class AddingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numnber:");
		int num1 = sc.nextInt();
		System.out.print("Enter the numnber:");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.printf("Sum of two numbers is:%d%n", sum);
		sc.close();
	}

}
