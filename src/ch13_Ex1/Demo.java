package ch13_Ex1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeomatricObject o = new Triangle(3.5, "white");
//		System.out.println(o.getArea());
//		System.out.println(o);
		total(o);	
	}
	public static void total(GeomatricObject area) {
		
		System.out.println(area.getArea());
	}
	

}