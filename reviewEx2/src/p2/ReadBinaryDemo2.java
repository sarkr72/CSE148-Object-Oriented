package p2;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReadBinaryDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int n = 0;
		int[] arr = new int[100000000];
		try {
			FileInputStream fis = new FileInputStream("Data.dat");
			DataInputStream dis = new DataInputStream(fis);
			while (true) {
				try {
					n = dis.readInt();
					arr[counter++] = n;
				} catch (EOFException e) {
					break;
				}
				System.out.print(n + " ");
			}
			System.out.println();
			
			int total = 0;
			int[] array = Arrays.copyOf(arr, counter);
			for (int i = 0; i < array.length; i++) {
				total += array[i];
			}
			System.out.println(" average is: " + (double)(total / counter));
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}