package ch13_Ex_7;

import java.util.Date;

public abstract class GeometricObject {
private String color = "white";
private boolean filled;
private Date dateCreated;

	public GeometricObject() {
		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean filled() {
		return filled;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "created on\n" + dateCreated + "\ncolor is: " + color + "\nfilled: " + filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}
