package chapter3;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("gautam","Manda",45.500);
		Employee e2 = new Employee("Chaitanya","Manda",-55.60);
		
		System.out.printf("Yearly sal of %s %s is:%.2f%n", e1.getFirstName(),e1.getLastName(),e1.getYearlySal());
		System.out.printf("Yearly sal of %s %s is:%.2f%n", e2.getFirstName(),e2.getLastName(),e2.getYearlySal());
		
		System.out.println("Raising yearly sal by 10%...");
		
		System.out.printf("Raised yearly sal of %s %s is:%.2f%n", e1.getFirstName(),e1.getLastName(),e1.raisedSal());
		System.out.printf("Raised yearly sal of %s %s is:%.2f%n", e2.getFirstName(),e2.getLastName(),e2.raisedSal());
		
	}

}
