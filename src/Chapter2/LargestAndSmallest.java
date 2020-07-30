package Chapter2;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		System.out.print("Enter the number:");
		int b = sc.nextInt();
		System.out.print("Enter the number:");
		int c = sc.nextInt();
		System.out.print("Enter the number:");
		int d = sc.nextInt();
		System.out.print("Enter the number:");
		int e = sc.nextInt();
		
		int largest=a;
		if(b>largest) {
			largest = b;
		}
		if(c>largest) {
			largest = c;
		}
		if(d>largest) {
			largest = d;
		}
		if(e>largest) {
			largest = e;
		}
		
		int smallest=a;
		if(b<smallest) {
			smallest = b;
		}
		if(c<smallest) {
			smallest = c;
		}
		if(d<smallest) {
			smallest = d;
		}
		if(e<smallest) {
			smallest = e;
		}
		
		System.out.printf("Largest number is:%d%nThe smallest number is:%d%n", largest,smallest);
	}

}
