package hw5;

public class Student extends Person {

	private Major major;
	private double gpa;
	private MiniStudentCourseBag miniStudentcourseBag;

	public Student(Name name, Major major, MiniStudentCourseBag miniStudentcourseBag) {
		super(name);
		this.major = major;
		this.miniStudentcourseBag = miniStudentcourseBag;
		this.gpa = miniStudentcourseBag.calculateGpa();
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public String getGpa() {
		this.gpa = miniStudentcourseBag.calculateGpa();
		String s = new String();
		s = gpa+"";
		return String.format("%-5s", s);
	}

	@Override
	public String toString() {
		return "Student ["+ super.toString() + ", major=" + major + ", gpa=" + getGpa() + "]";
	}

	@Override
	public void showName() {
		System.out.println("Name: " + getName());
		
	}

}
