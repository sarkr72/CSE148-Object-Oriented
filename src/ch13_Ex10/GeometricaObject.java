package ch13_Ex10;

public abstract class GeometricaObject implements Comparable{

	private String color;
	private boolean Filled;
	
	public GeometricaObject(String color, boolean Filled){
		this.color = color;
		this.Filled = Filled;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setBoolean(boolean Filled) {
		this.Filled = Filled;
	}
	
	public String toString() {
		return "color: " + color + "\nfilled : " + Filled;
	}
	
	abstract double getArea();
	abstract void getPerimeter();
}
