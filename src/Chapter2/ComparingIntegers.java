package Chapter2;

import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.printf("%d is larger than %d", num1,num2);
		}
		if(num1<num2) {
			System.out.printf("%d is larger than %d", num2,num1);
		}
		
	}

}
