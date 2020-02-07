package ch11_Ex_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Dem0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		System.out.println("enter the numbers: ");
		for(int i = 0; i <= 10; i++) {
			num.add(i);
		}
		System.out.println(num);
		deleteDuplicate(num);
		
	}
	
	public static void deleteDuplicate(ArrayList<Integer> num) {
		Scanner kb = new Scanner(System.in);
		int i = 10;
		while(i <= 10) {
			String n = kb.next();
			
			for(int j = 0; j <= 10; j++) {
				if(num.contains(i)) {
					num.remove(num.indexOf(j));
				}
			}
			i++;
		}
		
		System.out.println(num);
	}

}
