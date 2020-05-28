package interface2;

public class Cat extends Pet implements Animal{

	public void doTricks() {
		System.out.println("cat tricks");
	}
	public void displayTrick() {
		System.out.println("jump");
	}
	
	public void showSpecies() {
		System.out.println("species 1");
	}
	
	public void makeSound() {
		System.out.println("meow");
	}
	
	public String toString() {
		return "this is a cat";
	}
}
