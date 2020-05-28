package calculateGpa;

public class CourseBag {

	private Courses[] courses;
	private int nElements;

	public CourseBag(int maxBagSize) {
		courses = new Courses[maxBagSize];
		nElements = 0;
	}

	public Courses[] getCourse() {
		return courses;
	}

	public void insertCourse(Courses course) {
		courses[nElements++] = course;
	}

	public Courses searchByCourseNumber(String target) {
		for (int i = 0; i < nElements; i++) {
			if (courses[i].getCourseNubmer().equals(target)) {
				return courses[i];
			}
		}
		return null;
	}

	public Courses removeByCourseNumber(Courses target) {
		int i;
		for (i = 0; i < nElements; i++) {
			if (courses[i].getCourseNubmer().equals(target)) {
				break;
			}
		}
		if (i == nElements) {
			return null;
		} else {
			Courses temp = courses[i];
			for (int j = i; j < nElements - 1; j++) {
				courses[j] = courses[j + 1];
			}
			nElements--;
			return temp;
		}
	}

	public void showCourses() {
		for (int i = 0; i < nElements; i++) {
			System.out.println(courses[i]);
		}
		System.out.println();
	}

	public int getNElements() {
		// TODO Auto-generated method stub
		return nElements;
	}
}
