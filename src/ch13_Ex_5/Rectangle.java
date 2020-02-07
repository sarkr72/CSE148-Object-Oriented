package ch13_Ex_5;

public class Rectangle implements Comparable{

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		double area = length * width;
		System.out.println("rectangle area is : " + area);
		return area;
	}
}
