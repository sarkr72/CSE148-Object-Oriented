package ch12;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		try {
			quotient(a, b);
		} catch (ArithmeticException ex) {
			System.out.println("integer can not be divided by zero");
//			ex.printStackTrace();
			
		}
	}

	public static void quotient(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("dividor cant be zero");
		} else {
			System.out.println("result is: " + a / b);
		}
	}
}
