package p1;

public class Car {

		public String make;
		public double speed;
		public String year;
		
		public String toString() {
			return "Make:" + make + " || Speed:" + speed + " || Year:" + year;
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

		public Car(String make, double speed, String year) {
			this.make = make;
			this.speed = speed;
			this.year = year;
			
		}
}
