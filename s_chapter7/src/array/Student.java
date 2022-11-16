package array;

public class Student {

	private String name;
	private int id;
	
	public Student() {}
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void showStudentInfor() {
		System.out.println(id+","+name);
	}
}
