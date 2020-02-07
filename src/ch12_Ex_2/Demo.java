package ch12_Ex_2;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] num = {1, 4, 5, 3, 21, 33, 2, 7, 6};
		String[] months = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
		try {
		for(int i = 0; i <=12; i++) {
			System.out.print(months[num[i]] + " ");
//			throw new IndexOutOfBoundsException();
		}
	}
		catch(IndexOutOfBoundsException ex) {
			System.out.println("\nwrong month number!");
//			ex.printStackTrace();
		}
	}

}
