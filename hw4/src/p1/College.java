package p1;

public class College {
	private static String line = "------------------------------------------------";
	private Student[] students;
	private int numberOfStudent;
	private int maxStudentsNumbers;
	private Student student;

	public College(int maxStudentsNumbers) {
		super();
		students = new Student[maxStudentsNumbers];
		numberOfStudent = 0;
	}

	public void insertStudents(Student student) {
		students[numberOfStudent++] = student;
	}

	public Student removeStudentById(String id) {
		int i;
		System.out.println();
		for (i = 0; i < numberOfStudent; i++) {
			if (id.contentEquals(students[i].getId())) {
				break;
			}
		}
		Student temp = students[i];
		if (i == numberOfStudent) {
			return null;
		} else {
			for (int j = i; j < numberOfStudent - 1; j++) {
				students[j] = students[j + 1];
			}
			System.out.println(line);
			numberOfStudent--;
			return temp;
		}
	}

	public Student searchStudentById(String id) {
		System.out.println();
		for (int i = 0; i < numberOfStudent; i++) {
			if (id.contentEquals(students[i].getId())) {
				return students[i];
			}
			System.out.println(line);
		}
		return null;
	}

	public void display() {
		System.out.println();
		System.out.println("list of students: ");
		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println(students[i]);
			System.out.println(line);
		}
	}
}
