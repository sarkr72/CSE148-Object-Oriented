package p1;

public class Student {

	private String name;
	private int age;
	private double gpa;
	private String phoneNumber;

	public Student() {

	}

	public Student(String name, int age, double gpa, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public int getAge() {
		return age;
	}

	public int setAge(int age) {
		return this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public double setGpa(double gpa) {
		return this.gpa = gpa;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String setPhoneNumber(String phoneNumber) {
		return this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "name is: " + name + "\nage: " + age + "\ngpa: " + gpa + "\nphone Number: " + phoneNumber;
	}
}
