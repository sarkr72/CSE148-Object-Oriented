package interface2;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Dog dog = new Dog();
//	Cat cat = new Cat();
//	dog.displayTrick();
//	dog.showSpecies();
//	cat.displayTrick();
//	cat.showSpecies();
		
//		Animal dog1 = new Dog();
		
//	ArrayList<Animal> list = new ArrayList<>();
//	list.add(cat);
//	list.add(dog);
//	System.out.println(list);
		
//		Ananomous duck = new Ananomous() {
//
//			@Override
//			public void fly() {
//				// TODO Auto-generated method stub
//				System.out.println("flying");
//			}
//		};
//		duck.fly();
//		int x;
		Ananomous duck2 = (x, y) -> {
			System.out.println("flying at " + x + " "+y+ " miles");
		};
		duck2.fly(5, 5421);
	}

}
