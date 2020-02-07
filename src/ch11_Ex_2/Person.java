package ch11_Ex_2;

public class Person {

	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String setName(String name) {
		return this.name = name;
	}
	
	public String setAddress(String address) {
		return this.address = address;
	}
	
	public String setPhoneNumber(String phoneNumber) {
		return this.phoneNumber = phoneNumber;
	}
	
	public String setEmailAddress(String emailAddress) {
		return this.emailAddress = emailAddress;
	}
	
	public String toString() {
		return "Person" + " name is " + name;
	}
}
