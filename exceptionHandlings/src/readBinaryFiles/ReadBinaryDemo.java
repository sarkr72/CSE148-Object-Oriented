package readBinaryFiles;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream("Data.dat");
			DataInputStream dis = new DataInputStream(fis);
			while(true) {
				double number;
				try {
					number = dis.readDouble();
				} catch (EOFException e) {
					break;
				}
				
				System.out.println(number);
			}
			System.out.println("reached at the end");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
