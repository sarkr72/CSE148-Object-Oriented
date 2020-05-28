package readBinaryDemo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int number;
		
		FileInputStream fis = new FileInputStream("numbers.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 7; i++) {
			number = dis.readInt();
			System.out.println(number);
		}
		System.out.println("" + dis.readDouble());
		System.out.println(dis.readUTF());
		dis.close();
	}

}
