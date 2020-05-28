package p2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("rinku sarkar", 3.6, 1);
		Student s2 = new Student("john doe", 2.6, 2);
		Student s3 = new Student("joohn cena", 3.7, 3);
		Student s4 = new Student("rajon das", 1.6, 4);
		Student s5 = new Student("tonmoy paul", 3.9, 5);
		
		StudentBag studentBag = new StudentBag(1000);
		studentBag.insertStudents(s1);
		studentBag.insertStudents(s2);
		studentBag.insertStudents(s3);
		studentBag.insertStudents(s4);
		studentBag.insertStudents(s5);
		
		System.out.println(studentBag.searchStudentById(2));
		System.out.println(studentBag.removeStudentById(4));
		studentBag.display();
		
	}

}
