package ch9Ex13;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13_Location_demo {

	public static void main(String[] args) {

		Location myLocation;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the row");
		int row = input.nextInt();
		System.out.println("enter the column:");
		int column = input.nextInt();
		double[][] numArray = new double[row][column];

		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray.length; j++) {
				numArray[i][j] = (Math.random() * 100);
			}
		}
		System.out.println(Arrays.deepToString(numArray));
		myLocation = Location.locateLargestNumber(numArray);
		System.out.println("largest number is: " + myLocation.maxValue);
//		Location.locateLargestNumber(numArray);
	}

}
