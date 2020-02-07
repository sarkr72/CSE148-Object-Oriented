package ch6;

public class DemoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, n = 1;
		while(count <= 100) {
		int a = getPentagonalNumber(n);
		System.out.printf("%7d", a);
		if(count % 10 == 0) {
			System.out.println();
		}
		n++;
		count++;
		}
	}
	
	public static int getPentagonalNumber(int n) {
		n = n*(3*n - 1)/2;
		return n;
	}

}
