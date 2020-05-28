package calculateGpa;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Courses c1 = new Courses("CSE110", 1, "B");
		
		System.out.println(c1);
		System.out.println(c1.convert());
		CourseBag theBag = new CourseBag(10);
		theBag.insertCourse(c1);
		double gpa = GpaConverter.calculateGpa(theBag);
	}

}
