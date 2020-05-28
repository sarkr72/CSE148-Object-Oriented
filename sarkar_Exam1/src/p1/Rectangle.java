package p1;

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		double area = length * width;
		return area;
	}
}
