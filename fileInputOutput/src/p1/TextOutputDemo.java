package p1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextOutputDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter("myData.txt");
		pw.println("john doe, 1, 3.5");
		pw.println("john doe, 2, 4.5");
		pw.println("john doe, 3, 5.5");
		pw.println("john doe, 4, 6.5");
		pw.close();
		System.out.println("done writing");
	}
		
}
