package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(100010,"LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불금액은"+price+"이고,"+customerLee.showCustomerInfo());
		
		
		VIPcustomer customerKim = new VIPcustomer(100011,"Kim",1010);
		customerKim.calcPrice(10000);
		int price1 = customerKim.calcPrice(10000);
		System.out.println("지불금액은"+price1+"이고,"+customerKim.showCustomerInfo());
	}

}
