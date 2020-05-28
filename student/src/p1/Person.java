package p1;

public class Person {

	protected Name name;
	private String id;
	protected static int idCounter = 1;
	
//	public Person(Name name) {
//		super();
//		this.name = name;
////		id = String.valueOf(idCounter);
//	}
//	
	public static String id() {
		 String a = String.format("%08d", idCounter);
		 return a;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name  + "id: " + "]";
	}
}
