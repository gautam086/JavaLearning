package chapter3;

public class Invoice {

	public Invoice(String partNo, String partDesc, int quantity, double pricePerItem) {
		
		this.partNo = partNo;
		this.partDesc = partDesc;
		if(quantity>0) {
			this.quantity = quantity;
		}
		if(pricePerItem>0.0) {
		this.pricePerItem = pricePerItem;
		}
	}
	private String partNo;
	private String partDesc;
	private int quantity;
	private double pricePerItem;
	public String getPartNo() {
		return partNo;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity>0) {
			this.quantity = quantity;
		}
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem>0.0) {
		this.pricePerItem = pricePerItem;
		}
	}
	
	public double getInvoiceAmount() {
		double invoiceAmount = pricePerItem*quantity;
		return invoiceAmount;
	}
}
