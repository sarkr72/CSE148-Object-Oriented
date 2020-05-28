package interface2;

public class Dog extends Pet implements Animal {

	@Override
	public void displayTrick() {
		System.out.println("dogs trick");
	}

	@Override
	public void showSpecies() {
		System.out.println("species 2");
	}

	@Override
	public void makeSound() {
		System.out.println("barking");
	}

	@Override
	public void doTricks() {
		// TODO Auto-generated method stub
		System.out.println("dog tricks");
	}
	public String toString(){
		return "this is a dog";
	}

}
