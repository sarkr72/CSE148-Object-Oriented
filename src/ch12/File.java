package ch12;

//import java.io.PrintWriter;
import java.util.Scanner;

public class File {

	public static void main(String[] args) throws Exception {

		java.io.File file = new java.io.File("scores.text");
//		if (file.exists()) {
//			System.out.println("file already exists.");
//			System.exit(0);
//		}
//		try (PrintWriter input = new java.io.PrintWriter(file)) {
//			input.print("name");
//			input.println("45");
//		}
	Scanner input = new Scanner(file);
//	while(input.hasNext()) {
		String fName = input.next();
		String mName = input.next();
		String lName = input.next();
		int score = input.nextInt();
		System.out.println(fName + " " + mName + " " + lName + " " + score);
//	}
	input.close();
	
	}
}
