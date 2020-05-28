package p1;

public class Car {

	private String make;
	private double speed;
	private String year;
	
	public Car(String make, double speed, String year) {
		this.make = make;
		this.speed = speed;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [make =" + make + ", speed =" + speed + ", year =" + year + "]";
	}
	
	
}
