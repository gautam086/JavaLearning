package chapter3;

public class HeartRatesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeartRates h = new HeartRates("Gautam", "Manda", 16, 04, 1993); 
		System.out.printf("The age of person is:%d%n", h.getAge());
		System.out.printf("The maximum heart rate of %s is:%d%n", h.getFirstName(),h.maximumHeartRate());
		h.targetHeartRate();
		
	}

}
