package ch13_Ex_7;

public class Squre extends GeometricObject implements Colorable {

	private double side;

	public Squre() {

	}

	public Squre(double side) {
		this.side = side;
	}

	public Squre(double side, String color, boolean filled) {
		super(color, filled);
		setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		double area = Math.pow(side, 2);
		return area;
	}

	public double getPerimeter() {
		double perimeter = 4 * side;
		return perimeter;
	}

	public String howToColor() {
		return "color all the sides";
	}
	public String toString() {
		return super.toString() + "\narea of squre is: " + getArea() + "\nperimeter of squre is: " + getPerimeter();
	}
}
