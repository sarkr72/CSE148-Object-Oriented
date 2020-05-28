package interface2;

public interface Ananomous {
//one of them wont work only one.
	void fly(int n, int y); 
//	void run();
	
	default void swim() {
		System.out.println("swimming");
	}
	
}
