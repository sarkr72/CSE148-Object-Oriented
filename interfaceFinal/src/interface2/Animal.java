package interface2;

public interface Animal {

	public void displayTrick();
	public void showSpecies();
	public void makeSound();
	public String toString();
	
	default void eat() {
		System.out.println("eating");
	}
	
	static void fly() {
		System.out.println("flying");
	}
}
