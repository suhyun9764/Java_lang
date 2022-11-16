package alone;

public class StudentCard {
	private static int makeCardNum;
	int studentCardNum;
	int studentNum;
	
	public StudentCard(int studentNum) {
		this.studentNum = studentNum;
		makeCardNum = studentNum+100;
		studentCardNum = makeCardNum;
	}
	
	public static int showCardNum() {
		return makeCardNum;
	}
	
}
