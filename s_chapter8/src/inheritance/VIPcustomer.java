package inheritance;

public class VIPcustomer extends Customer {

	private int agentID;
	private double saleRatio;
	public VIPcustomer(int customerID, String customerName,int agentID) {
		
		super(customerID, customerName);
		this.agentID = agentID;
		bonusPoint = 1000;
		bonusRatio = 0.05;
		customerGrade = "VIP";
		saleRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
}
