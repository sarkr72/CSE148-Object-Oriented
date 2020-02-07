package ch13_Ex_7;

public class Demo {

	public static void main(String[] args) {
	GeometricObject[] squres = {new Squre(4.2), new Squre(12.3), new Squre(20.3),
			new Squre(7), new Squre(8)};

	for( int i = 0; i<squres.length; i++)
	{
		System.out.println("squre #: " + (i + 1));
		System.out.println("Area: " + squres[i].getArea());
		System.out.println("color :" + ((Squre) squres[i]).howToColor());
	}
}}
