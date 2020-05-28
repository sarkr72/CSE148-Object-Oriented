package p1;

public class Address {

	private String streetNumer;
	private String streetName;
	private String city;
	private String state;
	
	public Address(String streetNumer, String streetName, String city, String state) {
		super();
		this.streetNumer = streetNumer;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}
	 public Address() {
		 
	 }
	public String getStreetNumer() {
		return streetNumer;
	}
	public void setStreetNumer(String streetNumer) {
		this.streetNumer = streetNumer;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address:\n" + streetNumer + " " + streetName + ", \n" + city + " "
				+ state;
	}
	
	
}
