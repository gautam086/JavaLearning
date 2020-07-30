package Chapter2;

import java.util.Scanner;

public class CircleCalculation {
	private static double PI = Math.PI;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle");
		int r = sc.nextInt();
		System.out.printf("Diameter of cirlce is:%d%n", (2*r));
		System.out.printf("Area of cirlce is:%.2f%n", (PI*r*r));
		System.out.printf("Circumference of cirlce is:%.2f%n", (2*PI*r));
		
		
		
	}

}
