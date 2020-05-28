package p1;

public class Student {

	private String firstName;
	private String lastName;
	private double gpa;
	public Student(String firstName, String lastName, double gpa) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + "]";
	}
	
}
