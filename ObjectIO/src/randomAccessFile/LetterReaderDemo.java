package randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LetterReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		final int CHAR_SIZE = 2;
		long byteNumber;
		char ch;
		RandomAccessFile raf = new RandomAccessFile("letters.dat", "r");
		byteNumber = CHAR_SIZE * 1;
		raf.seek(2);
		ch = raf.readChar();
		System.out.println(ch);
	}

}
