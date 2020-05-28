package hw5;

import java.io.FileNotFoundException;

// put enumerated types in letter grade , faculty ex:pro...., MAJOR:CS....
public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
//		Name n1 = new Name("rinku", "sarkar");
//		Name n2 = new Name("john", "doe");
//		MiniStudentCourseBag msb = new MiniStudentCourseBag(10);
//		msb.insertMiniStudentCourse(new MiniStudentInfo("CSE148", 4, "B_PLUS", "Taking"));
//		Student s1 = new Student(n1, "computer_science", msb);
//		System.out.println(s1);
//		Student s2 = new Student(n2, "biology", msb);
//		msb.insertMiniStudentCourse(new MiniStudentInfo("BIO134", 2, "D_PLUS", "TO TAKE"));
//		System.out.println(s2);
//		System.out.println("FOUND: " + msb.findMiniStuentInfoByCourseNumber("BIO134"));
//		System.out.println("REMOVED: " + msb.removeMiniStudentInfoByCourseNumber("BIO134"));
//		System.out.println("display: ");
//		msb.displayMiniStudentInfo();

//		MiniFacultyCourseBag mfb = new MiniFacultyCourseBag(10);
//		Name n3 = new Name("ben", "chen");
//		Name n4 = new Name("john", "miller");
////		mfb.insertMiniFacultyCourseInfo(new MiniFacultyCourseInfo("ENG101", "english", 3, "taking"));
//		mfb.insertMiniFacultyCourseInfo(new MiniFacultyCourseInfo("MAT124", "math", 4, "taken"));
//		System.out.println("find:\n"+mfb.findMiniFacultyInfoByCourseNumber("MAT124"));
//		System.out.println("remove:\n"+mfb.removeMiniStudentInfoByCourseNumber("MAT124"));
//		System.out.println("display:");
//		mfb.displayMiniFacultyCourseInfo();
		
//		TextBookBag tb = new TextBookBag(10);
//		tb.insertTextBook(new TextBook("sahara", "46514651", "neil tyson", 12.55));
//		System.out.println();
//		tb.displayTextBooks();
		Helper.majorsFile();
	}

}
