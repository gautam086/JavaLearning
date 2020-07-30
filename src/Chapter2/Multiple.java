package Chapter2;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		System.out.print("Enter the multiple:");
		int b = sc.nextInt();
		
		if(b%a==0) {
			System.out.printf("%d is multiple of %d%n", a,b);
		}
		if(b%a!=0) {
			System.out.printf("%d is not multiple of %d%n", b,a);
		}
	}

}
