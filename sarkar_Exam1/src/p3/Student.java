package p3;

public class Student {

	private Name name;
	private int id;
//	private String letterGrade;
	public Student(Name name) {
		super();
		this.name = name;
		id++;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Student : " + name + " " + "id:" + id;
	}
	
}
