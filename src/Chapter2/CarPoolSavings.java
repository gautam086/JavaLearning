package Chapter2;

import java.util.Scanner;

public class CarPoolSavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many miles travelled per day:");
		double miles = sc.nextDouble();
		System.out.print("Cost per gallon:");
		double costPerGallon = sc.nextDouble();
		System.out.print("How much is the average:");
		double avg = sc.nextDouble();
		System.out.print("What is the parking fees per day:");
		double fees = sc.nextDouble();
		System.out.print("How many tools per day:");
		double tolls = sc.nextDouble();
		
		double gallonsRequired = miles/avg;
		double costIncurredPerDayOnGallons = gallonsRequired*costPerGallon;
		
		System.out.printf("%nThe Complete cost incurrred per day is:%.3f", (costIncurredPerDayOnGallons+tolls+fees));
		
	}

}
