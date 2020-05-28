package p1;

public class Student extends Person {

	private Major major;
	private static double gpa;
	private MiniStudentCourseBag miniStudentcourseBag;
	private int id;
	public Student(int id, Name name, Major major, MiniStudentCourseBag miniStudentcourseBag) {
		this.id = id;
		this.name = name;
		Person.idCounter++;
		this.major = major;
		this.miniStudentcourseBag = miniStudentcourseBag;
		Student.gpa = miniStudentcourseBag.calculateGpa();
//		PersonBag.insertId(Person.id());
//		PersonBag.insertGpa(getGpa());
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public static String getGpa() {
		String s = new String();
		s = gpa+"";
		return String.format("%-5s", s);
	}

	@Override
	public String toString() {
		return "Student ["+ super.toString() + "id" + Person.id() + ", major=" + major  + "]";
	}

//	@Override
//	public void setName(Name name) {
//		this.setName(name);
//	}

}
