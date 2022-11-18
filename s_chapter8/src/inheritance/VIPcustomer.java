package inheritance;

public class VIPcustomer extends Customer {

	private int agentID;
	
	public VIPcustomer(int customerID, String customerName,int agentID) {
		
		super(customerID, customerName);
		this.agentID = agentID;
		bonusPoint = 1000;
		bonusRatio = 0.05;
		customerGrade = "VIP";
		
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
}
