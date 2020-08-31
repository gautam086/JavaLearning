package chapter3;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice i1 = new Invoice("A123","Bulbs",12,12.50);
		Invoice i2 = new Invoice("A356","Lights",0,12.50);
		
		
		System.out.printf("Please find the invoice generate for:%s%n", i1.getPartNo());
		System.out.printf("Description:%s%nFinalAmount:%.2f%n", i1.getPartDesc(),i1.getInvoiceAmount());
		
		System.out.printf("Please find the invoice generate for:%s%n", i2.getPartNo());
		System.out.printf("Description:%s%nFinalAmount:%.2f", i2.getPartDesc(),i2.getInvoiceAmount());
		
	}

}
