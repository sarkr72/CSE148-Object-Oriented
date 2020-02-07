package ch11Ex1;

public class GeometricObject {

	private String color = "white";
	private boolean filled;
	
	public GeometricObject() {
		
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public String setColor(String color) {
		return this.color = color;
	}
	
	public boolean setFilled(boolean filled) {
		return this.filled = filled;
	}
	
	public String toString() {
		return "color :" +color + " Filled : " + filled;
	}
}
