package p1;

public class MiniStudentCourseBag {

	private MiniStudentCourseInfo[] miniStudentCourseInfo;
	private int nElems;

	public MiniStudentCourseBag(int maxCourseBags) {
		super();
		miniStudentCourseInfo = new MiniStudentCourseInfo[maxCourseBags];
		nElems = 0;
	}
	
	public MiniStudentCourseInfo[] getMiniStudentInfo() {
		return miniStudentCourseInfo;
	}

	public void setMiniStudentInfo(MiniStudentCourseInfo[] miniStudentInfo) {
		this.miniStudentCourseInfo = miniStudentInfo;
	}

	public void insertMiniStudentCourse(MiniStudentCourseInfo studentInfo) {
		miniStudentCourseInfo[nElems++] = studentInfo;
	}
	
	public double calculateGpa() {
		double gradePoint = 0;
		int totalCredits = 0;
		for(int i = 0; i < nElems; i ++) {
			gradePoint += miniStudentCourseInfo[i].getNumberOfCredits() * miniStudentCourseInfo[i].convertGrade();
			totalCredits += miniStudentCourseInfo[i].getNumberOfCredits();
		}
		return gradePoint/totalCredits;
	}

	public MiniStudentCourseInfo findMiniStuentInfoByCourseNumber(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (courseNumber.contentEquals(miniStudentCourseInfo[i].getCourseNumber())) {
				return miniStudentCourseInfo[i];
			}
		}
		return null;
	}

	public MiniStudentCourseInfo removeMiniStudentInfoByCourseNumber(String courseNumber) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (courseNumber.contentEquals(miniStudentCourseInfo[i].getCourseNumber())) {
				break;
			}
		}
		MiniStudentCourseInfo temp = miniStudentCourseInfo[i];
		if (i == nElems) {
			return null;
		} else {
			for (int j = i; j < nElems - 1; j++) {
				miniStudentCourseInfo[j] = miniStudentCourseInfo[j + 1];
			}
		}
		nElems--;
		return temp;
	}

	public void displayMiniStudentInfo() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(miniStudentCourseInfo[i]);
			System.out.println();
		}
	}

}
