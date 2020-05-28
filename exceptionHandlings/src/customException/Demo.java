package customException;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner kb;
		boolean b = false;
		while(!b) {
			kb = new Scanner(System.in);
		try {
		System.out.println("enter first number");
		int n1 = kb.nextInt();
		System.out.println("enter second number");
		int n2 = kb.nextInt();
		double result = safeDivide(n1, n2);
		System.out.println("result is : " + String.format("%8.2f", result));
		b = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		}
	}

	private static double safeDivide(int i, int l) {
		if(l == 0) {
			try {
			throw new DivisionByZeroException("can not divide zero");
		}catch(DivisionByZeroException e) {
			System.out.println(e);
			return secondChance();
		}
		}
		return i * 1.0 / l;
	}

	private static double secondChance() {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int n1 = kb.nextInt();
		System.out.println("enter the second number: ");
		int n2 = kb.nextInt();
		return n1 / n2;
	}

}
