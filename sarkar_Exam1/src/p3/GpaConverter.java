package p3;

public class GpaConverter {
//	private int counter;
//	private static Courses[] courses;
	
//	public GpaConverter(Courses[] courses) {
//		super();
//		this.courses = courses;
//	}

	
	
	public static double calculateGpa(Courses course) {
		 Courses[] courses = Courses.getCourses();
		int nElements = 4;
		double gradePoint = 0;
		int totalCredits = 0;
		for(int i = 0; i < nElements; i++) {
			gradePoint += courses[i].getCredits() * courses[i].convert();
			totalCredits += courses[i].getCredits();
		}
		return gradePoint / totalCredits;
	}
}
