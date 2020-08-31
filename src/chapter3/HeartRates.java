package chapter3;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {

	public HeartRates(String firstName, String lastName, int date, int month, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.month = month;
		this.year = year;
	}
	private String firstName;
	private String lastName;
	private int date;
	private int month;
	private int year;
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
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

	public int getAge() {
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(year,month,date );  //Birth date
		Period p = Period.between(birthday, today);
		int age = p.getYears();
		return age;
	}
	
	public int maximumHeartRate() {
		
		int maxRate = 220 - getAge();
		return maxRate;
	}
	
	public void targetHeartRate() {
		int lowerRate = (int)(maximumHeartRate()*0.5);
		int higherRate = (int)(maximumHeartRate()*0.85);
		
		System.out.println("The range of heartRate is between " +lowerRate+" and "+higherRate);
	}

}
