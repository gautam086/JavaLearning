package chapter3;

public class Employee {

	public Employee(String firstName, String lastName, double monthSal) {
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthSal>0.0) {
		this.monthSal = monthSal;
		}
	}
	private String firstName;
	private String lastName;
	private double monthSal;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMonthSal() {
		return monthSal;
	}
	public void setMonthSal(double monthSal) {
		if(monthSal>0.0) {
		this.monthSal = monthSal;
		}
	}
	
	public double getYearlySal() {
		double yearlySal = monthSal*12;
		return yearlySal;
	}
	
	public double raisedSal() {
		
		double raisedSal = getYearlySal()+(getYearlySal()*0.1);
		
		return raisedSal;
	}
	
	
	
}
