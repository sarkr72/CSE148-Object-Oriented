package ch13_Ex1;

public class Triangle extends GeomatricObject{
	public final double PI = 3.1416;
	private double radius;
	private String color;
	private boolean isFilled;
	
	public Triangle(double radius, String color) {
		this.radius = radius;
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "radius: " + radius + "\n" + "is filled: " + isFilled + "\ncolor" + color;
	}

	@Override
	public double getArea() {
		double area = PI * (radius * radius);
		return area;
	}
}
