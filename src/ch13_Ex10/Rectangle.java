package ch13_Ex10;

public class Rectangle extends GeometricaObject implements Comparable {

	private double side1;
	private double side2;
	private String color;
	private boolean Filled;
	
	public Rectangle(double side1, double side2, String color, boolean Filled) {
		super(color, Filled);
		this.side1 = side1;
		this.side2 = side2;
//		setColor(color);
//		setBoolean(Filled);
	}
	
	public double getArea() {
		double area = side1 * side2;
		return area;
	}
	@Override
	public boolean equals(Rectangle rec) {
		return this.compareTo(rec) == 0;
	}
	
	@Override
	public double compareTo(Rectangle rec) {
		if(this.getArea() > rec.getArea())
			return 1;
		else if(this.getArea() < rec.getArea())
			return -1;
		else
		return 0;
	}
	
	@Override
	public void getPerimeter() {
		double perimeter = 2 * (side1 + side2);
		System.out.println("perimeter is: " + perimeter);
		
	}

	
//	public double compare(Rectangle rec) {
//		// TODO Auto-generated method stub
//		if(this.side1 > rec.side1)
//			return 1;
//		return 0;
//	}
	

}
