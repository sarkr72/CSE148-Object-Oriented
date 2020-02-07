package ch11_Ex_2;

public class Student extends Person {

	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;
	
	public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}
	
	public int setStatus(int status) {
		return this.status = status;
	}
	
	public String getStatus() {
		switch(status) {
		case 1: return "FRESHMAN";
		case 2: return "SOPHOMORE";
		case 3: return "JUNIOR";
		case 4: return "SENIOR";
		default : return "unknown";
		}
	}
		
		public String toString() {
			return super.toString() + "\nStatus " + getStatus();
		}
}
