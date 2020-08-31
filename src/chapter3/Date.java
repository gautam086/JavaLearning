package chapter3;

public class Date {
	public Date(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
	private int date;
	private int month;
	private int year;
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
	
	public void displayDate() {
		System.out.printf("The current date is:%d/%d/%d",month,date,year);
	}
}
