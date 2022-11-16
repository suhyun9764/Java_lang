package thisex;

public class Taxi {
	
	int taxiNum;
	int money;
	int passenger;
	
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showInfor() {
		System.out.println("택시"+taxiNum+"번은 승객"+passenger+"명을 태웠고, 수입은"+money+"입니다.");
	}
}
