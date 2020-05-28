package p3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class RandomAccessDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int l = rand.nextInt(900) + 100;
		RandomAccessFile raf = new RandomAccessFile("RandomNum.dat", "rw");
		for (int i = 0; i < l; i++) {
			int n = rand.nextInt(901) + 100;
			raf.writeInt(n);
		}
		raf.close();
	}

}
