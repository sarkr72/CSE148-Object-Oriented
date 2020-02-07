package ch6;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true) {
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		sortedNumbers(a,b,c);
		}
	}

		private static void sortedNumbers(int num1, int num2, int num3) {
			int temp;
			if (num2 > num1 && num2 > num3){
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			else if (num3 > num1 && num1 < num2) {
				temp = num1; 
				num1 = num3;
				num3 = temp;
			}
			if (num3 > num2) {
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			
			System.out.println(num1 +" "+ num2 +" " + num3 );
		}
}
