package ch6;

public class Ex_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1200;
		for(int i = 2; i < n; i ++) {
			if(i % 2 != 0 && (i + 2) % 2 != 0) {
				System.out.println("(" + i + ", " + (i+2) + ")");
			}
			
		}
	}
}
