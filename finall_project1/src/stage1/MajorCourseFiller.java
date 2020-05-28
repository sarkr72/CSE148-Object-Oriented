package stage1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MajorCourseFiller {

	public static MiniStudentCourseBag fillWithMajorCourses(Major major) throws FileNotFoundException {
		MiniStudentCourseBag bag = new MiniStudentCourseBag(60);
		
		College c = new College();
//		MasterCourseBag mcb = c.getMasterCourseBag();
		
		File file = new File("MajorCourses/" + major.toString() + ".txt");
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()) {
			String courseNumber = scan.nextLine();
//			System.out.println("course:"+courseNumber);
//			System.out.println("major" + major.name());
//			Course c1 = mcb.findCourseByCourseNumber(courseNumber);
//			double credits = c1.getCourseCredits();
			bag.insertMiniStudentMajorInfo(new MiniStudentCourseInfo(courseNumber));
		}
		scan.close();
		return bag;
	}
}
