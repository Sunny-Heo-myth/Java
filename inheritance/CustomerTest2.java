package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer customerLizi = new VIPCustomer(10020, "Lily Elizabeth", 10000);
//		customerLizi.setCustomerID(10020);
//		customerLizi.setCustomerName("Lily Elizabeth");
//		customerLizi.bonusPoint = 10000;
		System.out.println(customerLizi.showCustomerInfo());

	}

}
