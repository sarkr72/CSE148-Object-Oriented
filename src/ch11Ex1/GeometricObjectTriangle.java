package ch11Ex1;

public class GeometricObjectTriangle {

	public static void main(String[] args) {

		Triangle tri = new Triangle();
		
		System.out.println(tri);
		System.out.println(tri.getColor() + "\n" + tri.getArea() + "\n" + tri.getPerimeter());
		System.out.println(tri.setSide1(10) + tri.setSide1(50.25) + tri.getArea());
		
		

	}

}
