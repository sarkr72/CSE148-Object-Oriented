package object_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		Student s1 = new Student("A", 1);
//		FileOutputStream fos = new FileOutputStream("Students.dat");
//		ObjectOutputStream obs = new ObjectOutputStream(fos);
//		obs.writeObject(s1);
//		obs.close();
		FileInputStream fis = new FileInputStream("Students.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student)(ois.readObject());
		System.out.println(s);
	}

}
