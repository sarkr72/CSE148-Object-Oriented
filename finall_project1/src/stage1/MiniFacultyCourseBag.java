package stage1;

public class MiniFacultyCourseBag {

	private MiniFacultyCourseInfo[] miniFacultyCourseInfo;
	private int nElems;
	
	public MiniFacultyCourseBag(int maxFacultyBags) {
		super();
		miniFacultyCourseInfo = new MiniFacultyCourseInfo[maxFacultyBags];
		nElems = 0;
	}
	
	public void insertMiniFacultyCourseInfo(MiniFacultyCourseInfo facultyInfo) {
		miniFacultyCourseInfo[nElems++] = facultyInfo;
	}
	
	public MiniFacultyCourseInfo findMiniFacultyInfoByCourseNumber(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (courseNumber.contentEquals(miniFacultyCourseInfo[i].getCourseNumber())) {
				return miniFacultyCourseInfo[i];
			}
		}
		return null;
	}
	
	public MiniFacultyCourseInfo removeMiniStudentInfoByCourseNumber(String courseNumber) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (courseNumber.contentEquals(miniFacultyCourseInfo[i].getCourseNumber())) {
				break;
			}
		}
		MiniFacultyCourseInfo temp = miniFacultyCourseInfo[i];
		if (i == nElems) {
			return null;
		} else {
			for (int j = i; j < nElems - 1; j++) {
				miniFacultyCourseInfo[j] = miniFacultyCourseInfo[j + 1];
			}
		}
		nElems--;
		return temp;
	}
	
	public void displayMiniFacultyCourseInfo() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(miniFacultyCourseInfo[i]);
		}
	}
	
}
