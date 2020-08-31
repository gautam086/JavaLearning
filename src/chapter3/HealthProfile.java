package chapter3;

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
	public HealthProfile(String firstName, String lastName, int date, int month, int year,double weight,double height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.month = month;
		this.year = year;
		this.setWeight(weight);
		this.setHeight(height);
		
	}
	private String firstName;
	private String lastName;
	private double weight;
	private double height;
	private int date;
	private int month;
	private int year;
	
	public String getDOB() {
		String r = date+"/"+month+"/"+year;
		return r;
	}
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public void BMICalculator() {
	double BMI =  (weight)/(height*height);
	System.out.printf("BMI of person is:%.2f%n", BMI);
	System.out.printf("%s%n%s%n%s%n%s%n", "BMI VALUES","Underweight: less than 18.5","Normal: between 18.5 and 24.9","Overweight: between 25 and 29.9");
	}
	
}
