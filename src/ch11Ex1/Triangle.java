package ch11Ex1;

public class Triangle extends GeometricObject {

	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
//		super(color, filled);
		setColor(color);
		setFilled(filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle() {
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		return .5 * side1 * side2;
	}
	
	public double setSide1(double side1) {
		return this.side1 = side1;
	}

	public double setSide2(double side2) {
		return this.side2 = side2;;
	}

	public double setSide3(double side3) {
		return this.side3 = side3;
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return super.toString() + " side1 :" + side1 + " side2 :" + side2 + " side3 :" + side3;
	}
}
