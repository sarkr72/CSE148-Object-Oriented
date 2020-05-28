package p1;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Demo d = new Demo();
		boolean b = false;
		while (!b) {
			d.input();
			b = true;
		}
	}
	
 public void input() {
		Scanner kb = null;
		int n2 = 0;
		int n1 = 0;
			try {
				kb = new Scanner(System.in);
				System.out.println("enter the first number: ");
				 n1 = kb.nextInt();
				System.out.println("enter the second number: ");
				 n2 = kb.nextInt();
				double result = n1 / n2;
				System.out.println("result: " + String.format("%10.2f",result));
				
			}  catch (Exception e) {
				System.out.println(e);
				System.out.println(" Enter only integer. \n \t Let's try from the begining.");
				input();
			}
 }
 
}