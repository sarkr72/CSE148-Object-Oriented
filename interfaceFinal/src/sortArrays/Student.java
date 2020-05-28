package sortArrays;

public class Student implements Comparable{

	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(this.gpa >= ((Student)o).gpa) {
			return 1;
		}
		else {
		return -1;	
		}
	}

	
//	@Override
//	public int compareTo(Object o) {
//		int result = this.name.compareTo(((Student)o).name);
//		if (result > 0)
//			return 1;
//		else if(result == 0) {
//			return 0;
//		}
//		else {
//			return -1;
//		}
//	}
	
	
	
}
