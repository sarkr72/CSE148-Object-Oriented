package stage1;

public class MiniStudentCourseBag {

	protected MiniStudentCourseInfo[] miniStudentCourseInfoArray;
	private MiniStudentCourseInfo[] miniStudentMajorsArray;
	private int nElems;
//	protected static String[] gpaArray = new String[5];
	int counterx;
	
	public MiniStudentCourseBag(int maxCourseBags) {
		super();
		miniStudentCourseInfoArray = new MiniStudentCourseInfo[maxCourseBags];
		miniStudentMajorsArray = new MiniStudentCourseInfo[maxCourseBags];
		nElems = 0;
		counterx = 0;
	}

	public void insertMiniStudentCourseInfo(MiniStudentCourseInfo studentInfo) {
		miniStudentCourseInfoArray[nElems++] = studentInfo;
		miniStudentMajorsArray[counterx++] = studentInfo;
	}

	public void insertMiniStudentMajorInfo(MiniStudentCourseInfo studentInfo) {
		miniStudentMajorsArray[counterx++] = studentInfo;
	}
//	gpaArray[counter++] = String.format("%-4s", calculateGpa());
	
	public MiniStudentCourseInfo findMiniStuentInfoByCourseNumber(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (courseNumber.contentEquals(miniStudentCourseInfoArray[i].getCourseNumber())) {
				return miniStudentCourseInfoArray[i];
			}
		}
		return null;
	}

	public MiniStudentCourseInfo removeMiniStudentInfoByCourseNumber(String courseNumber) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (courseNumber.contentEquals(miniStudentCourseInfoArray[i].getCourseNumber())) {
				break;
			}
		}
		MiniStudentCourseInfo temp = miniStudentCourseInfoArray[i];
		if (i == nElems) {
			return null;
		} else {
			for (int j = i; j < nElems - 1; j++) {
				miniStudentCourseInfoArray[j] = miniStudentCourseInfoArray[j + 1];
			}
		}
		nElems--;
		return temp;
	}

	public void displayMiniStudentInfo() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(miniStudentCourseInfoArray[i]);
			System.out.println();
		}
	}

}
