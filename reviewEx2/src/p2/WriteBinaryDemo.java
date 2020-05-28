package p2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class WriteBinaryDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			FileOutputStream fos = new FileOutputStream("Data.dat");
		 DataOutputStream dos = new DataOutputStream(fos);
		 Random rand = new Random();
			int l = rand.nextInt(900) + 100;
			
			for(int i = 0; i < l ; i++) {
				 dos.writeInt(rand.nextInt(901) + 100);
			}
		dos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
