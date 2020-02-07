package ch13_Ex_5;

public class Circle implements Comparable {
	
	private final double PI = 3.1416;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = PI * (radius * radius);
		System.out.println("area is: " + area);
		return area;
	}
}
