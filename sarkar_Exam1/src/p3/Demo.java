package p3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Name n1 = new Name("Rinku", "Sarkar");
		Student s1 = new Student(n1);
		
		Courses c1 = new Courses(10);
				c1.insertCourse(new Courses("CSE110", 1, "B"));
		c1.insertCourse( new Courses("ENG101", 3, "A"));
		c1.insertCourse(new Courses("CSE148", 4, "C"));
		c1.insertCourse( new Courses("HIS101", 3, "D"));
		
		GpaConverter converter = new GpaConverter();
//		System.out.println("gpa is:"+converter.calculateGpa(c1));
		System.out.println(s1 );
		System.out.printf("%-10s%-10.2f\n", "gpa is:", converter.calculateGpa(c1));
	}

}
