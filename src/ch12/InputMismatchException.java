package ch12;

import java.util.*;

public class InputMismatchException {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		boolean continueInput = true;
			do{
				try {
					System.out.println("enter a number: ");
				int number = kb.nextInt();
				
				System.out.println("the nubmer you entered is : " + number);
				continueInput = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("try again: incorrect input. an integer required.");
				kb.nextLine();
			}
		}while(continueInput);
	}
}
