package object_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		College college = new College(10);
//		
//		Student s1 = new Student("we",32);
//		Student s2 = new Student("fes",22);
//		StudentBag sb = college.getStudentBag();
//		sb.insert(s1);
//		sb.insert(s2);
//		
//		FileOutputStream fos = new FileOutputStream("College.dat");
//		ObjectOutputStream os = new ObjectOutputStream(fos);
//		os.writeObject(college);
//		os.close();
		
		College college = null;
		File file =  new File("College.dat");
		if(file.exists()) {
			FileInputStream fis = new FileInputStream("College.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			college = (College)(ois.readObject());
			ois.close();
		}
		college.getStudentBag().display();
	}
}
