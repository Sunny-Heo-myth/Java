package inheritance;

public class Customer {
	private int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//public Customer() {
	//	customerGrade = "SILVER";
	//	bonusRatio = 0.01;
	//	System.out.println("Customer() constructor called.");
	//}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, string) constructor called.");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String showCustomerInfo() {
		return "Your name is " + customerName + " and your grade is " + 
				customerGrade + ". Your bonus point is " +  bonusPoint + ".";
	}
}