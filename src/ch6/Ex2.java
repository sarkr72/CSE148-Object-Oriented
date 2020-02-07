package ch6;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int a = input.nextInt();
		System.out.println(a + (isPalindrome(a)? " is" : " is not") + " a palindrome");
	}

	private static boolean isPalindrome(int n) {
		return n == reverse(n) ? true : false;
	}

	private static int reverse(int n) {
	String num = n +"";
	String reverse = "";
	for(int i = num.length()-1; i >= 0; i--) {
		reverse += num.charAt(i);
	}
	return Integer.parseInt(reverse);	
	}
	

}
