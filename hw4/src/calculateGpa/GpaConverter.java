package calculateGpa;

public class GpaConverter {

	public static double calculateGpa(CourseBag theBag) {
		Courses[] courses = theBag.getCourse();
		int nElements = theBag.getNElements();
		double gradePoint = 0;
		int totalCredits = 0;
		for(int i = 0; i < nElements; i++) {
			gradePoint += courses[i].getCredits() * courses[i].convert();
			totalCredits += courses[i].getCredits();
		}
		return gradePoint / totalCredits;
	}
}
