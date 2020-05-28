package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import p1.Student;

public class Helper {

	public static void allCourses() {

	}

//	public static void courses(String fileName) throws FileNotFoundException {
//		File file = new File(fileName);
//		Scanner scanner = new Scanner(file);
//		String str = "";
//		int i = 1;
//		int n = 1;
//		int count = 0;
//		String courseN = "";
//		String courseT = "";
//		String courseD = "";
//		double credits = 0;
//		MasterCourseBag cb = new MasterCourseBag(1000000);
//		while (scanner.hasNextLine()) {
//			str = scanner.nextLine();
//			if (i == ((n * 5) - 4)) {
//				courseN = str;
//			}
//			if (i == ((n * 5) - 3)) {
//				courseT = str;
//			}
//			if (i == ((n * 5) - 2)) {
//				courseD = str;
//			}
//			if (i == ((n * 5) - 1)) {
//				credits = Double.parseDouble(str);
//			}
//			i++;
//			if (i % 5 == 0) {
//				cb.insertCourse(new Course(courseN, courseT, courseD, credits));
//				n++;
//			}
//		}
//		System.out.println(cb.findCourseByCourseNumber("MAT142"));
//		System.out.println(cb.findCourseByCourseNumber("ART101"));
//	}
//
//	public static void textBooks(String isbn1, String title1, String firstNames, String lastNames)
//			throws FileNotFoundException {
//		File file1 = new File(isbn1);
//		File file2 = new File(title1);
//		File file3 = new File(firstNames);
//		File file4 = new File(lastNames);
//		Scanner isbns = new Scanner(file1);
//		Scanner titles = new Scanner(file2);
//		Scanner fNames = new Scanner(file3);
//		Scanner lNames = new Scanner(file4);
//		String price1 = "";
//		TextBookBag tb = new TextBookBag(10000000);
//		while (isbns.hasNextLine() && titles.hasNextLine() && fNames.hasNextLine() && lNames.hasNextLine()) {
//			String isbn = isbns.nextLine();
//			String title = titles.nextLine();
//			String first = fNames.nextLine();
//			String last = lNames.nextLine();
//			double price = (double) (0.0 + (Math.random() * 200.00));
//			tb.insertTextBook(new TextBook(title, isbn, new Name(first, last), price));
//		}
//		System.out.println(tb.findTextBookByIsbn("978-0-12-815422-9"));
//		System.out.println(tb.findTextBookByIsbn("978-2-294-75916-1"));
//	}

	public static void students() {
		MiniStudentCourseBag miniStudentCourseBag = new MiniStudentCourseBag(1000);
		PersonBag pb = new PersonBag(1000000);

//		Person p1 = new Person(n1);
//		Person p2 = new Person(n2);
//		Person p3 = new Person(n3);
//		Person p4 = new Person(n4);
//		Person p5 = new Person(n5);

		Name n1 = new Name("rinku", "sarkar");
		Name n2 = new Name("the", "rock");
		Name n3 = new Name("neil", "tyson");
		Name n4 = new Name("kevin", "hart");
		Name n5 = new Name("jeckie", "chang");
		int id = 0;
		Student s1 = new Student(id++, n1, Major.CSE, miniStudentCourseBag);
		Student s2 = new Student(id++, n2, Major.CST, miniStudentCourseBag);
		Student s3 = new Student(id++, n3, Major.MAT, miniStudentCourseBag);
		Student s4 = new Student(id++, n4, Major.PHY, miniStudentCourseBag);
		Student s5 = new Student(id++,n5, Major.CHE, miniStudentCourseBag);
		pb.insertPerson(s1);
		pb.insertPerson(s2);
		pb.insertPerson(s3);
		pb.insertPerson(s4);
		pb.insertPerson(s5);
		pb.displayPersons();
	}

}
