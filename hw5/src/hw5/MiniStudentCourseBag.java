package hw5;

public class MiniStudentCourseBag {

	private MiniStudentCourseInfo[] miniStudentInfo;
	private int nElems;

	public MiniStudentCourseBag(int maxCourseBags) {
		super();
		miniStudentInfo = new MiniStudentCourseInfo[maxCourseBags];
		nElems = 0;
	}
	
	public MiniStudentCourseInfo[] getMiniStudentInfo() {
		return miniStudentInfo;
	}

	public void setMiniStudentInfo(MiniStudentCourseInfo[] miniStudentInfo) {
		this.miniStudentInfo = miniStudentInfo;
	}

	public void insertMiniStudentCourse(MiniStudentCourseInfo studentInfo) {
		miniStudentInfo[nElems++] = studentInfo;
	}
	
	public double calculateGpa() {
		double gradePoint = 0;
		int totalCredits = 0;
		for(int i = 0; i < nElems; i ++) {
			gradePoint += miniStudentInfo[i].getNumberOfCredits() * miniStudentInfo[i].convertGrade();
			totalCredits += miniStudentInfo[i].getNumberOfCredits();
		}
		return gradePoint/totalCredits;
	}

	public MiniStudentCourseInfo findMiniStuentInfoByCourseNumber(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (courseNumber.contentEquals(miniStudentInfo[i].getCourseNumber())) {
				return miniStudentInfo[i];
			}
		}
		return null;
	}

	public MiniStudentCourseInfo removeMiniStudentInfoByCourseNumber(String courseNumber) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (courseNumber.contentEquals(miniStudentInfo[i].getCourseNumber())) {
				break;
			}
		}
		MiniStudentCourseInfo temp = miniStudentInfo[i];
		if (i == nElems) {
			return null;
		} else {
			for (int j = i; j < nElems - 1; j++) {
				miniStudentInfo[j] = miniStudentInfo[j + 1];
			}
		}
		nElems--;
		return temp;
	}

	public void displayMiniStudentInfo() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(miniStudentInfo[i]);
			System.out.println();
		}
	}

}
