package hw5;

public class Faculty extends Person {
	enum titles {
		PRO, ASSISTENT_PRO, DR
	};

	private String prof;
	private double salary;
	private String officePhone;
	private MiniFacultyCourseBag miniFacultyCourseBag;

	public Faculty(Name name, String prof, double salary, String officePhone,
			MiniFacultyCourseBag miniFacultyCourseBag) {
		super(name);
		this.prof = prof;
		this.salary = salary;
		this.officePhone = officePhone;
		this.miniFacultyCourseBag = miniFacultyCourseBag;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

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

	@Override
	public void showName() {
		System.out.println("name: " + getName());

	}

}
