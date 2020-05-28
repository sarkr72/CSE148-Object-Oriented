package p1;

public class Name {

	private String firstName;
	private String middleI;
	private String lastName;
	
	public Name(String firstName, String middleI, String lastName) {
		super();
		this.firstName = firstName;
		this.middleI = middleI;
		this.lastName = lastName;
	}
	
	public Name() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleI() {
		return middleI;
	}

	public void setMiddleI(String middleI) {
		this.middleI = middleI;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "firstName:" + firstName + ", middleI:" + middleI + ",  lastName:" + lastName;
	}
	
}
