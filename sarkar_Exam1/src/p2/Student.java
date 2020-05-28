package p2;

public class Student {

	private String name;
	private double gpa;
	private int id;
	public Student(String name, double gpa, int id) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}
	
}
