package alone;

public class StudentCardTest {

	public static void main(String[] args) {
		StudentCard student1 = new StudentCard(100);
		StudentCard student2 = new StudentCard(150);
		
		System.out.println("student1의 학번은"+student1.studentNum+"이고, 카드번호는"+student1.studentCardNum+"입니다.");
		System.out.println("student2의 학번은"+student2.studentNum+"이고, 카드번호는"+student2.studentCardNum+"입니다.");
		System.out.println("static 변수의 값은"+StudentCard.showCardNum()+"입니다.");
	}

}
