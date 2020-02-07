package ch9Ex_4;

public class Ex_4Random {

	int nums;
	String all;

	
	public static int total(int n) {
		int a = 0;
		int count = 0;
		for(int i = 0; i < n; i++) {
			a = (int)(Math.random() * 101);
			System.out.print(a + " ");
			if(count > 50) {
				break;
			}
			count++;
		}
		return a;
	}
}
