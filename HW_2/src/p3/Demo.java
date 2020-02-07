package p3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat("katty");
		int i = 0;
		while (i < 5) {
			int num = (int) (5 + Math.random() * 10);
			c.feed(num);
			i++;
		}
		double pounds = c.getWeight() * 0.0624999;
		System.out.printf("%-10s%-50s\n%-10s%.2f%2s%10s%.2f", "name is: ", c.getName(), "weight: ", c.getWeight(), "oz",
				"pounds:", pounds);
	}

}
