package p2;

import p1.Student;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s3 = new Student("dwayne johnson", 44, 2.6, "6316514144");
		Student s4 = new Student("the miz", 40, 2.2, "63161651");
		Student s5 = new Student("emon rahman", 18, 4.00, "631948416");

		Student[] students = new Student[10];
		students[0] = s3;
		students[1] = s4;
		students[2] = s5;

		showStudents(students);
	}

	public static void showStudents(Student[] students) {
		for (int i = 0; i < 3; i++) {
			System.out.println(students[i]);
			System.out.println();
		}
	}
}
