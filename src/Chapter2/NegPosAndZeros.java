package Chapter2;

import java.util.Scanner;

public class NegPosAndZeros {

	public static void main(String[] args) {
		int pos = 0;
		int neg = 0;
		int zero = 0;
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
		
		if(a>0) {
			pos++;
		}
		if(b>0) {
			pos++;
		}
		if(c>0) {
			pos++;
		}
		if(d>0) {
			pos++;
		}
		if(e>0) {
			pos++;
		}
		

		if(a<0) {
			neg++;
		}
		if(b<0) {
			neg++;
		}
		if(c<0) {
			neg++;
		}
		if(d<0) {
			neg++;
		}
		if(e<0) {
			neg++;
		}
		
		if(a==0) {
			zero++;
		}
		if(b==0) {
			zero++;
		}
		if(c==0) {
			zero++;
		}
		if(d==0) {
			zero++;
		}
		if(e==0) {
			zero++;
		}
		
		
		System.out.printf("No of positive values are:%d%nNo of negative value are:%d%nNo of zeros are:%d%n",pos,neg,zero);
		
	}

}
