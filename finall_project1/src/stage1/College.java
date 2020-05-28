package stage1;

import java.io.FileNotFoundException;

public class College {

	private PersonBag personBag;
	private ClassRoomBag classRoomBag;
	private TextBookBag textBookBag;
	private MasterCourseBag masterCourseBag;
	
	public College() throws FileNotFoundException {
		personBag = new PersonBag(1000,1000);
		classRoomBag = new ClassRoomBag(100000);
		textBookBag = new TextBookBag(2000);
		masterCourseBag =  masterCourseBag();
	}
	
//	public void filledCourses(String str) {
//		File file = new File("RawData"/"Courses"/"CourseIn");
//		Helper.courses(fileName);
//	}
	
	public void classRoomBag()throws FileNotFoundException{
		  Helper.classRooms(classRoomBag);
	}
	public static MasterCourseBag masterCourseBag() throws FileNotFoundException {
		return Helper.courses("RawData/Courses/Course_Inventory.txt");
	}
	
	public MasterCourseBag getMasterCourseBag() throws FileNotFoundException {
		return masterCourseBag();
	}
	
	public static void textBookBag() throws FileNotFoundException {
		TextBookBag tb = new TextBookBag(10000000);
		Helper.textBooks(tb, "RawData/TextBooks/textbook_isbns.txt", "RawData/TextBooks/textbook_titles.txt", "RawData/Names/First Names.txt", "RawData/Names/Last Names.txt");
	}
	
	public static void students() throws FileNotFoundException {
		PersonBag pb = new PersonBag(1000000,10000);
		Helper.students(pb);
	}
}
