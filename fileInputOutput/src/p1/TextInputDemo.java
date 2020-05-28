package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TextInputDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("myData.txt");
		Scanner scanner = new Scanner(file);
		String[] tokens = new String[(int) file.length()];
		while (scanner.hasNextLine()) {
			String aLine = scanner.nextLine();
			tokens = aLine.split(" ");
			System.out.println(Arrays.toString(tokens));
		}
		
	}

}
