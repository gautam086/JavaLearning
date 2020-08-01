package Chapter2;

import java.util.Scanner;

public class GrowthRateWorldPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter current world population in crores:");
		double pop = sc.nextDouble();
		System.out.print("Enter the annual growth rate:");
		double annual = sc.nextDouble();
		
		System.out.printf("%s%11s%n", "Year","Growth");
		double first = pop+((pop*annual)/100);
		double second =first+((2*first*annual)/100);
		double third = second+((2*second*annual)/100);
		System.out.printf("%d%14.3f%n", 1,first);
		System.out.printf("%d%14.3f%n", 2,second);
		System.out.printf("%d%14.3f%n", 3,third);
		
	}

}
