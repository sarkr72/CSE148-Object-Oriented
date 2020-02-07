package ch11_Ex_2;

public class Employee extends Person {

	private int office;
	private double salary;
	private MyDate dateHired;
	
	public Employee(String name, String address, String phoneNumber, String emailAddress, int office, double salary) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}
	
	public int getOffice() {
		return office;
	}
	
	public String getSalary() {
		return String.format("%.2f", salary);
	}
	
	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
	}
	
	public int setOffice(int office) {
		return this.office = office;
	}
	
	public double setSalary(double salary) {
		return this.salary = salary;
	}
	
	public MyDate setDateHired(MyDate dateHired) {
		return this.dateHired = dateHired;
	}
	
	public String toString() {
		return super.toString() + "\noffice: " + office + "\nsalary: " + getSalary() + "\ndate hired: " + getDateHired();
	}
}
