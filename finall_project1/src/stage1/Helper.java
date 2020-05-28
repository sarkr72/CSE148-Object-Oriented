package stage1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Helper {
	public static void allCourses() {

	}

	public static MasterCourseBag courses(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		MasterCourseBag cb = new MasterCourseBag(1000000);
		String str = "";
		int i = 1;
		int n = 1;
		String courseN = "";
		String courseT = "";
		String courseD = "";
		double credits = 0;

		while (scanner.hasNextLine()) {
			str = scanner.nextLine();
			if (i == ((n * 5) - 4)) {
				courseN = str;
			}
			if (i == ((n * 5) - 3)) {
				courseT = str;
			}
			if (i == ((n * 5) - 2)) {
				courseD = str;
			}
			if (i == ((n * 5) - 1)) {
				credits = Double.parseDouble(str);
			}
			i++;
			if (i % 5 == 0) {
				cb.insertCourse(new Course(courseN, courseT, courseD, credits));
				n++;
			}
		}
		scanner.close();
		System.out.println(cb.findCourseByCourseNumber("PED101"));
//		System.out.println(cb.findCourseByCourseNumber("ART101"));
//		System.out.println(cb.findCourseByCourseNumber("HUM101"));

		return cb;
	}

	public static void textBooks(TextBookBag tb, String isbn1, String title1, String firstNames, String lastNames)
			throws FileNotFoundException {
		File file1 = new File(isbn1);
		File file2 = new File(title1);
		Scanner isbns = new Scanner(file1);
		Scanner titles = new Scanner(file2);

		while (isbns.hasNextLine() && titles.hasNextLine()) {
			String isbn = isbns.nextLine();
			String title = titles.nextLine();
			Name[] authors = getAuthorArray(firstNames, lastNames);
			double price = (double) (0.0 + (Math.random() * 200.00));
			tb.insertTextBook(new TextBook(title, isbn, authors, price));
		}
//		System.out.println(tb.findTextBookByIsbn("978-0-12-815422-9"));
//		System.out.println(tb.findTextBookByIsbn("978-2-294-75916-1"));
		tb.displayTextBooks();
	}

	private static Name[] getAuthorArray(String fNames, String lNames) throws FileNotFoundException {
		Name[] nameArray = new Name[4];
		int randomNumber = (int) (Math.random() * 4) + 1;

		for (int i = 0; i < randomNumber; i++) {
			nameArray[i] = popName();
		}
		Name[] compactedArray = Arrays.copyOf(nameArray, randomNumber);

		return compactedArray;
	}

	private static String popRandomName(String fileName) throws FileNotFoundException {
		String[] names = FileReaderHelper.readFile(fileName);
		int randomNumber = (int) (Math.random() * names.length);
		String randomName = names[randomNumber];
		return randomName;
	}

	public static Name popName() throws FileNotFoundException {
		String firstName = popRandomName("RawData/Names/First Names.txt");
		String lastName = popRandomName("RawData/Names/Last Names.txt");
		Name name = new Name(firstName, lastName);
		return name;
	}

	public static double calculateGpa(MiniStudentCourseBag msb) {
		double gradePoint = 0;
		int totalCredits = 0;
		for (int i = 0; i < msb.counterx; i++) {

			gradePoint += msb.miniStudentCourseInfoArray[i].getNumberOfCredits()

					* msb.miniStudentCourseInfoArray[i].convertGrade();

			totalCredits += msb.miniStudentCourseInfoArray[i].getNumberOfCredits();

//			System.out.println("credits: " + msb.miniStudentCourseInfoArray[i].getNumberOfCredits() + " grade: "
//					+ msb.miniStudentCourseInfoArray[i].convertGrade() + " total credits :"
//					+ msb.miniStudentCourseInfoArray[i].getNumberOfCredits());
		}
//		System.out.println("grade :" + gradePoint + "credits: " + totalCredits);

		return gradePoint / totalCredits;
	}

	public static void students(PersonBag pb) throws FileNotFoundException {
		MiniStudentCourseBag miniStudentCourseBag = new MiniStudentCourseBag(1000);
		MiniStudentCourseBag msc = new MiniStudentCourseBag(1000);
		MiniStudentCourseBag msc2 = new MiniStudentCourseBag(1000);
		MiniStudentCourseBag msc3 = new MiniStudentCourseBag(1000);
		MiniStudentCourseBag msc4 = new MiniStudentCourseBag(1000);
		
		miniStudentCourseBag.insertMiniStudentCourseInfo(
				new MiniStudentCourseInfo("CSE118", 4, EnumGrades.B_PLUS, CourseStatus.TAKEN));
		miniStudentCourseBag
				.insertMiniStudentCourseInfo(new MiniStudentCourseInfo("CSE148", 4, EnumGrades.B, CourseStatus.TAKING));
		miniStudentCourseBag.insertMiniStudentCourseInfo(
				new MiniStudentCourseInfo("MAT124", 4, EnumGrades.C_PLUS, CourseStatus.TO_TAKE));
		miniStudentCourseBag.insertMiniStudentCourseInfo(
				new MiniStudentCourseInfo("CSE110", 1, EnumGrades.D_PLUS, CourseStatus.TAKING));
		miniStudentCourseBag.insertMiniStudentCourseInfo(
				new MiniStudentCourseInfo("ENG101", 3, EnumGrades.A, CourseStatus.TO_TAKE));

		msc.insertMiniStudentCourseInfo(new MiniStudentCourseInfo("PED112", 1, EnumGrades.B_PLUS, CourseStatus.TAKEN));
		msc.insertMiniStudentCourseInfo(new MiniStudentCourseInfo("CSE148", 4, EnumGrades.B, CourseStatus.TAKING));
		msc.insertMiniStudentCourseInfo(
				new MiniStudentCourseInfo("MAT126", 4, EnumGrades.C_PLUS, CourseStatus.TO_TAKE));
		msc.insertMiniStudentCourseInfo(new MiniStudentCourseInfo("CSE110", 1, EnumGrades.D_PLUS, CourseStatus.TAKING));
		msc.insertMiniStudentCourseInfo(new MiniStudentCourseInfo("ENG101", 3, EnumGrades.A, CourseStatus.TO_TAKE));

//		miniStudentCourseBag.displayMiniStudentInfo();
//		msc.displayMiniStudentInfo();

		Name n1 = new Name("rinku", "sarkar");
		Name n2 = new Name("the", "rock");
		Name n3 = new Name("neil", "tyson");
		Name n4 = new Name("kevin", "hart");
		Name n5 = new Name("jeckie", "chang");

		Student s1 = new Student(n1, Major.CSE, miniStudentCourseBag);
		Student s2 = new Student(n2, Major.ACC, msc);
//		Student s3 = new Student(n3, Major.ACC, msc2);
//		Student s4 = new Student(n4, Major.BUS, msc3);
//		Student s5 = new Student(n5, Major.AUT, msc4);

		pb.insertPerson(s1);
		pb.insertPerson(s2);
//		pb.insertPerson(s3);
//		pb.insertPerson(s4);
//		pb.insertPerson(s5);

		System.out.println();
//		System.out.println("find" + pb.findPersonById("00000002"));
//		pb.findGpaById("00000002");
//		pb.removePersonById("00000002");

		pb.displayPersons();
	}

	public static void faculty() {
		MiniFacultyCourseBag miniFacultyCourseBag = new MiniFacultyCourseBag(100000);
		PersonBag pb = new PersonBag(100000, 100000);
		Name n6 = new Name("meridith", "leo");
		Name n7 = new Name("jamie", "wright");
//		Faculty f1 = new Faculty(n6, Title.PROF, 100000, "631-844-8645", miniFacultyCourseBag);
//		Faculty f2 = new Faculty(n7, Title.PROF, 100000, "631-844-8645", miniFacultyCourseBag);
//		pb.insertFaculty(f1);
//		pb.insertFaculty(f2);
		pb.displayFaculty();
	}

	public static void classRooms(ClassRoomBag classRoomBag) throws FileNotFoundException {
//		File file = new File(fileName);
		for(int i = 0; i < 400; i++) {
			String roomNumber = "R" + String.format("%03d", i);
			classRoomBag.insertClassroom(new Classroom(roomNumber, EnumBuildings.Riverhead));
		}
		for(int i = 0; i < 400; i++) {
			String roomNumber = "I" + String.format("%03d", i);
			classRoomBag.insertClassroom(new Classroom(roomNumber, EnumBuildings.Islip));
		}
		for(int i = 0; i < 400; i++) {
			String roomNumber = "S" + String.format("%03d", i);
			classRoomBag.insertClassroom(new Classroom(roomNumber, EnumBuildings.Smithtown));
		}
		for(int i = 0; i < 400; i++) {
			String roomNumber = "N" + String.format("%03d", i);
			classRoomBag.insertClassroom(new Classroom(roomNumber, EnumBuildings.NFL));
		}
		classRoomBag.displayClassrooms();
	}
}
