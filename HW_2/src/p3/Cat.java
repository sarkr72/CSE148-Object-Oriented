package p3;

public class Cat {

	private String name;
	private double weight = 15;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public double setWeight(double weight) {
		return this.weight = +weight;
	}

	public void feed(int foodAmount) {
		double num = foodAmount / 10;
		double num2 = foodAmount % 10;
		weight += num * 1;
		weight += num2 * 0.1;
	}
}
