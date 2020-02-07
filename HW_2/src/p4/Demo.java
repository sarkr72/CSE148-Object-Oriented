package p4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char[] ch = s.toCharArray();

		System.out.println("|Serial" + "|title  " + "           | price |");
		System.out.println("|---------------------------------|");
		for (int i = 1; i <= 1000; i++) {
			String bookName = "";
			int random = (int) (5 + Math.random() * 11);
			double price = (double) (0 + Math.random() * 100);
			for (int j = 0; j < random; j++) {
				bookName += ch[j];
			}
			Book b = new Book(bookName, price);
			System.out.printf("|%-4d%4s%-15s%4s%.2f%2s\n", i, "| ", b.getTitle(), "| ", b.getPrice(), "|");
			System.out.println("|---------------------------------|");
		}
	}

}
