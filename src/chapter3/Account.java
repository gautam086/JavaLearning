package chapter3;

public class Account {
	private String name;
	private double balance;
	public Account(String name,double balance) {
		this.name = name;
		if(balance>0.0) {
			this.setBalance(balance);
		}
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		if(balance>0.0) {
		this.balance = balance;
		}
	}
	public void depositAmount(double deposit) {
		if(deposit>0.0) {
			System.out.println("Please wait while amount is deposited:");
			balance = balance+deposit;
			System.out.println("DOne");
		}
		else {
			System.out.println("Please try again...");
		}
	}
	
	public void withDraw(double withdraw) {
		if(withdraw>balance) {
			System.out.println("Withdrawal amount exceeding account balance...");
		}
		else {
			balance = balance - withdraw;
		}
	}
	
	
}
