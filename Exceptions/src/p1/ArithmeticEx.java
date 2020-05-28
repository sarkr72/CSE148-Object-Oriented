package p1;

import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the fisrt number");
		int n = scanner.nextInt();
		System.out.println("enter the second number");
		int n2 = scanner.nextInt();
		double result=0;
		try {
		result = n / n2;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(result);
	}

}
