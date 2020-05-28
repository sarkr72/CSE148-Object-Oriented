package p1;

public class Faculty extends Person {

	private Title title;
	private String prof;
	private double salary;
	private String officePhone;
	private MiniFacultyCourseBag miniFacultyCourseBag;

	public Faculty(Name name, Title title, double salary, String officePhone,
			MiniFacultyCourseBag miniFacultyCourseBag) {
		super(name);
		this.salary = salary;
		this.officePhone = officePhone;
		this.miniFacultyCourseBag = miniFacultyCourseBag;
	}

	public Title getTitle() {
		return title;
	}
	
	public void settitle(Title title) {
		this.title = title;
	}
//	
//	public String getProf() {
//		return prof;
//	}
//
//	public void setProf(String prof) {
//		this.prof = prof;
//	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public MiniFacultyCourseBag getMiniFacultyCourseBag() {
		return miniFacultyCourseBag;
	}

	public void setMiniFacultyCourseBag(MiniFacultyCourseBag miniFacultyCourseBag) {
		this.miniFacultyCourseBag = miniFacultyCourseBag;
	}

	@Override
	public String toString() {
		return super.toString() + "Faculty [prof=" + prof + ", salary=" + salary + ", officePhone=" + officePhone + "]";
	}

//	@Override
//	public void showName() {
//		System.out.println("name: " + getName());
//
//	}

//	@Override
//	public void setName(Name name) {
//		this.setName(name);
//	}

}
