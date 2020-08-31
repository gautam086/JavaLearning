package chapter3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("Jane Green", 50.50);
		Account a2 = new Account("Gautam Manda", -89.50);
		
		displayAccountBalance(a1);
		displayAccountBalance(a2);
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to be deposited in account1:");
		double deposit = sc.nextDouble();
		a1.depositAmount(deposit);

		displayAccountBalance(a1);
		displayAccountBalance(a2);
		
		System.out.print("Enter amount to be deposited in account1:");
		deposit = sc.nextDouble();
		a2.depositAmount(deposit);

		displayAccountBalance(a1);
		displayAccountBalance(a2);
		
		System.out.print("Enter amount to be withdrawn from account1:");
		double withdraw = sc.nextDouble();
		a1.withDraw(withdraw);

		displayAccountBalance(a1);
		displayAccountBalance(a2);
		
		System.out.print("Enter amount to be withdrawn from account2:");
		withdraw = sc.nextDouble();
		a2.withDraw(withdraw);
		
		displayAccountBalance(a1);
		displayAccountBalance(a2);
		
		sc.close();
	}

	public static void displayAccountBalance(Account account) {
		System.out.printf("Name of the account is:%s having balance of:%.2f%n", account.getName(), account.getBalance());

	}
}
