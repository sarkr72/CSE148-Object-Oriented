package p1;

public class Student {

	
	private String name;
	private Major major;
	public Student(String name, Major major) {
		super();
		this.name = name;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + "]";
	}

	
	
}
