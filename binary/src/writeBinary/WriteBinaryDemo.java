package writeBinary;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int[] numbers = {92312, 23434, 3433446, 999998, 18893430, 18877882, 14233, 123,343, 456567};
		FileOutputStream fos = new FileOutputStream("numbers.dat", false);
		DataOutputStream dos = new DataOutputStream(fos);
		for(int number : numbers) {
			dos.writeInt(number);
		}
		dos.writeDouble(123.221);
		dos.writeUTF("Hi");
		dos.close();
	}

}
