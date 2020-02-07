package ch6;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter the password: ");
		String password = input.nextLine();
		int count = 0, digit = 0;
		while(password.length() <= 10) {
			for(int i = 0; i < password.length(); i++) {
				if(Character.isLetterOrDigit(password.charAt(i))) {
					count++;
				}
					if(Character.isDigit(password.charAt(i))) {
					digit++;
				}
					}
			if(digit < 3) {
				break;
			}else {
				System.out.println("isValid");
			}
			System.out.println("enter the password: ");
			password = input.nextLine();
		}
			System.out.println("inValid");
		}
	}
