package array;

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] stArr = new Student[5];
		
		stArr[0] = new Student("james",100);
		stArr[1] = new Student("tomas",101);
		stArr[2] = new Student("harry",102);
		stArr[3] = new Student("jone",103);
		stArr[4] = new Student("faker",104);
		
		for(int i =0; i<stArr.length;i++) {
			stArr[i].showStudentInfor();
		}

	}

}
