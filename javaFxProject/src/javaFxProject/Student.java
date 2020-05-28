package javaFxProject;

public class Student extends Person{

	private Name name;
	private String id;
	private static int idCounter = 1;
	public Student(Name name) {
		super(name);
		this.name = name;
		this.id = String.format("%08d", idCounter++);
	}
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
}
