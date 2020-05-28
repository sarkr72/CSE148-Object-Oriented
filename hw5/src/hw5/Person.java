package hw5;

public abstract class Person {

	private Name name;
	private int id;
	private int idCounter = 1;
	
	public Person(Name name) {
		super();
		this.name = name;
		id = idCounter++;
	}

	public abstract void showName();
	
	public String id() {
		return String.format("%08d", id);
	}
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id() + "]";
	}
//	int length = 7;
//	if(idCounter == 10) {
//		length=6;
//	}if(idCounter == 100) {
//		length = 5;
//	}
//	String s = new String();
//	for(int i = length; i > 0; i--) {
//		s += "0";
//	}
//	id = s;
//	id += idCounter++;
}
