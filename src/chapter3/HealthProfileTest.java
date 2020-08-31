package chapter3;

public class HealthProfileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthProfile p = new HealthProfile("gautam","Manda",16,04,1993,83.35,1.72);
		System.out.printf("Data of person:%n%s %s%n%s%n%.2f%n%.2f%n", p.getFirstName(),p.getLastName(),p.getDOB(),p.getWeight(),p.getHeight());
		System.out.printf("Maximum hear rate of person is:%d%n", p.maximumHeartRate());
		p.targetHeartRate();
		p.BMICalculator();
	}

}
