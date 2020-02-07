package ch6;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		float a = 0.2f;
		System.out.println("i\t|\t" + "m(i)");
		for(float i = 1; i <= n; i++) {
			a =i + i/(i+2);
			System.out.printf(i + "\t|\t" + a);
			System.out.println();
		}
	}

}
