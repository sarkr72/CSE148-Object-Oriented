package exceptionHandlingsp1;

import java.util.Scanner;

public class NullPointerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = null;
		System.out.println("enter your name");
		String name = null;
		try {
			name = scanner.nextLine();
		}catch(NullPointerException e) {
			scanner = new Scanner(System.in);
			name = scanner.nextLine();
		}
		System.out.println(name);
	}

}
