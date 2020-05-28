package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 = new Rectangle(1,2);
		Rectangle r2 = new Rectangle(3,4);
		Rectangle r3 = new Rectangle(5,6);
		
		double area1 = r1.getArea();
		double area2 = r2.getArea();
		double area3 = r3.getArea();
		double totalArea = area1 + area2 + area3;
		System.out.println("total area is: " + totalArea);
	}

}
