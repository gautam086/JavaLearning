package Chapter2;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight in kilograms:");
		double weight = sc.nextDouble();
		System.out.print("Enter your height in kilograms:");
		double height = sc.nextDouble();
		double BMI =  (weight)/(height*height);
		System.out.printf("BMI of person is:%.2f%n", BMI);
		System.out.printf("%s%n%s%n%s%n%s%n", "BMI VALUES","Underweight: less than 18.5","Normal: between 18.5 and 24.9","Overweight: between 25 and 29.9");
	}

}
