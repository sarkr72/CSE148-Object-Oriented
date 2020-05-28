package p1;

public class Student {

	private Name name;
	private int id;
	private static int idCounter = 1;
	private Address address;
	private String phoneNumber;
	private String major;
	private double GPA;
	
	public Student(Name name, Address address, String phoneNumber, String major, double gPA) {
		super();
		this.name = name;
		this.id = idCounter++;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.major = major;
		GPA = gPA;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	@Override
	public String toString() {
		return  name + ",\nid:" + id + ", \n" + address + ",\nphoneNumber:" + phoneNumber
				+ ",\nmajor:" + major + ",\nGPA:" + GPA;
	}
	
}
