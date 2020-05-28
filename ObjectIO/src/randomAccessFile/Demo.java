package randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo {

	public static void main(String[] args) throws IOException {
		char[] ch = {'A', 'B', 'R', 'T', 'U', 'L', 'O', 'I'};
		
		RandomAccessFile raf = new RandomAccessFile("letters.dat", "rw");
		for(char c : ch) {
			raf.writeChar(c);
		}
		raf.close();
		System.out.println("done");

	}

}
