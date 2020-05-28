package interface2;

public abstract class Pet {

	private String name = "pet1";
	private int age = 10;
	
	public abstract void doTricks();
	public String toString() {
		return "this is a pet";
	}
}
