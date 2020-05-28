package string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringDemo {

	public static void main(String[] args) throws IOException {
//	FileOutputStream fos = new FileOutputStream("testout.txt");
//	String s = "welcome to java";
//	byte[] b = s.getBytes();
//	fos.write(b);
//	fos.close();
		
//		FileInputStream fis = new FileInputStream("testout.txt");
//		System.out.println(fis.read());
//	fis.close();
		
		FileInputStream fis = new FileInputStream("testout.txt");
//		int i = fis.read();
//		System.out.println((char)i);
//		fis.close();
		int i = 0; 
		while((i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		fis.close();
	}
}
