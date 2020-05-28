package stage1;

import java.io.FileNotFoundException;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

//		String firstName = Helper.popRandomName("RawData/Names/First Names.txt");
//		String lastName = Helper.popRandomName("RawData/Names/First Names.txt");
//		System.out.println(firstName + " " + lastName);
//		College.textBookBag();
//		College.masterCourseBag();
		
//		System.out.println("it's gonna take while "+"\n please wait...");
//		College.textBookBag();
//		College.students();
		College c = new College();
		c.classRoomBag();
	}

}
