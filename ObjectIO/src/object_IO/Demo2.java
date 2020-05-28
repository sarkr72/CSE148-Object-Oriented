package object_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//	Student s1 = new Student("a", 44);
//	Student s2 = new Student("e", 32);
//	StudentBag sb = new StudentBag(5);
//	sb.insert(s1);
//	sb.insert(s2);
//	String str = "grfewgref grfewgrfe  refdrfewef"+"\n" + "rinku";
//	FileOutputStream fos = new FileOutputStream("students2.dat");
//	ObjectOutputStream obs = new ObjectOutputStream(fos);
//	obs.writeObject(sb);
//	obs.writeUTF(str);
//	obs.close();
		FileInputStream fis = new FileInputStream("students2.dat");
		ObjectInputStream ois =  new ObjectInputStream(fis);
		StudentBag sb = (StudentBag)(ois.readObject());
		sb.display();
		System.out.println(ois.readUTF());
}
}
