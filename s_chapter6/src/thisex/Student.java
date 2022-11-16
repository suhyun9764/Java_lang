package thisex;

public class Student {
	
	String StName;
	int money;
	int grade;
	
	public Student() {}
	
	public Student(String StName, int money) {
		this.StName = StName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		money-=10000;
	}
	
	public void showInfo() {
		System.out.println(StName+"님의 남은 돈은"+money+"입니다.");
	}

}
