package readBinaryFiles;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("Data.dat");
		 DataOutputStream dos = new DataOutputStream(fos);
		for (int i = 0; i < 10000; i++) {
				dos.writeDouble(Math.random() * 10000);
		}
		dos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
