package Chapter2;

import java.util.Scanner;

public class DigitSeparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be separated:");
		int num = sc.nextInt();
		
		int r1  = num%10;
		int q1 = num/10;
		
		int r2  = q1%10;
		q1 = q1/10;
		
		int r3  = q1%10;
		q1 = q1/10;
		
		int r4  = q1%10;
		q1 = q1/10;
		
		int r5  = q1%10;
		q1 = q1/10;
		
		
		System.out.printf("%d %d %d %d %d", r5,r4,r3,r2,r1);
		
	}

}
