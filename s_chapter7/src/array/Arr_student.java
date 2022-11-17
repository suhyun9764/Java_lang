package array;

import java.util.ArrayList;

public class Arr_student {

	private int studentNum;
	private String studentName;
	private ArrayList<Arr_subject> subjectList;
	
	public Arr_student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	
			subjectList = new ArrayList<Arr_subject>();
	}
	
	public void addSubject(String name, int score ) {
		Arr_subject subject = new Arr_subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total =0;
		for(Arr_subject subject : subjectList) {
			total += subject.getScore();
			System.out.println("학생"+studentName+"님의"+subject.getName()+"과목의 성적은"+
					subject.getScore()+"점 입니다");
		}
		
		System.out.println("학생"+studentName+"님의 총점은"+
				total+"점 입니다");
	}
}
