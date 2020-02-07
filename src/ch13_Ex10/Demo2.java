package ch13_Ex10;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle(10.2, 12, "white", true);
		Rectangle rectangle2 = new Rectangle(1.2, 2, "black", false);
		Rectangle rectangle3 = new Rectangle(1.2, 2, "black", false);

		System.out.println("rectangle is " + (rectangle.equals(rectangle2) ? "" : "not") + " equal to rectangle2");
		System.out.println("rectangle2 is " + (rectangle2.equals(rectangle3) ? "" : "not") + " equal to rectangle3 ");
	System.out.println(rectangle);
	}

}
