package p3;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class ReadRandomNumbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		RandomAccessFile raf = new RandomAccessFile("RandomNum.dat", "r");
//		final int size = 2;
//		long byteNumber;
		int total = 0;
		int a;
		int counter = 0;
		int[] arr = new int[100000];
		
		raf.seek(0);
		
		while(true) {
//			byteNumber = size * (int)(Math.random() * 150);
//			System.out.println("byte" + byteNumber);
			
//			raf.seek(byteNumber);// it gives me numbers that are not in file;
			
			int r = 0;
			try {
				r = raf.readInt();
				arr[counter++] = r;
				System.out.print(r + " ");
			} catch (EOFException e) {
				break;
			}
		}
		
		int[] arr2 = Arrays.copyOf(arr, counter);
		
//		System.out.println("length" + arr2.length);
		
		for(int i = 0; i < 100; i++) {
			a = (int)(Math.random() * 100);
			 total += arr2[a];
		}
		System.out.println("\n" + "average: " + (double)(total / 100));
		raf.close();
	}
}
