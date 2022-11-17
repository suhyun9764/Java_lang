package array;

public class studentTest {

	public static void main(String[] args) {
		
		Arr_student studentLee = new Arr_student(1001,"Lee");
		studentLee.addSubject("국어",100);
		studentLee.addSubject("수학",90);
		
		studentLee.showStudentInfo();
		
		Arr_student studentKim = new Arr_student(1001,"Kim");
		studentKim.addSubject("국어",80);
		studentKim.addSubject("수학",70);
		
		System.out.println("============================");
		studentKim.showStudentInfo();
		
		
		
		
		

	}

}
