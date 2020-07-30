package Chapter2;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		
		if(a%2==0) {
			System.out.printf("Given number:%d is even%n", a);
		}
		if(a%2!=0) {
			System.out.printf("Given number:%d is odd%n", a);
		}
	}

}
