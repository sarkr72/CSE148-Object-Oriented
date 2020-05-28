package stage1;

public abstract class Person {

	private Name name;
	private String id;
	private static int idCounter = 1;
	
	public Person(Name name) {
		this.name = name;
		id = String.valueOf(idCounter++);
		id = String.format("%08d", Integer.parseInt(id));
	}
	
	public String getId() {
		return id;
	}
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}
