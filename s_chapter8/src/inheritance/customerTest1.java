package inheritance;

public class customerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10101,"Lee");	
		
		VIPcustomer customerKim = new VIPcustomer(10102,"Kim",1011);
		
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}

}
