package ch13_Ex_5;

public class GeometricObject{

	public static void main(String[] args) {
//		Comparable com = new Circle(3.25);
//		Comparable com1 = new Rectangle(4, 12.5);
//		max(com.getArea(),
//		com1.getArea());
		System.out.println(max(new Circle(3.25), new Rectangle(12.5, 4)));
//		max(com, com1);
	}
	public static boolean max(Circle circle, Rectangle rec) {
		return circle.getArea() == rec.getArea();
	}

}
