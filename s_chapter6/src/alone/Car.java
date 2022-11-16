package alone;

public class Car {
	
	private static int SerialNum=10000;
	private int carNum;
	public Car() {
		SerialNum++;
		carNum = SerialNum;
	}
	
	public int getcarNum() {
		return carNum;
	}
	
	public void setcarNum(int carNum) {
		this.carNum = carNum;//
	}
	
	
}
