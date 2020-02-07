package ch6;

public class Ex_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int count = 0;
		while (count < 120) {
			if ((n % 2) == 0) {
				continue;
			}
			String b = n + "";
			String c = "";
			for (int j = 0; j < b.length(); j++) {
				c += b.charAt(b.length() - 1 - j);
			}
			int num = Integer.parseInt(c);
			if (num != n) {
				continue;
			}
			n++;
		}
			count++;
			System.out.print(n + " ");
		if (count % 10 == 0) {
			System.out.println();
		}
	}
}
