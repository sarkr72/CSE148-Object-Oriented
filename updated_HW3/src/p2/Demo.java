package p2;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	private static String line = "---------------------------------------------------";
	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			showMenu();
			Order[] order = createOrder();
			showCheck(order);
			System.out.println();
			System.out.println("do you want another customer? Y or N");
			String rep = kb.next();
			if (rep.contentEquals("N")) {
				break;
			}
		}
//		int i = 1;
//		while (true) {
//			i++;
//			orders[i] = order;
//			System.out.println("do you want another order? Y or N");
//			String ans = kb.next();
//			if (ans.contentEquals("N")) {
//				break;
//			}
//		}
//		Order[] array2 = new Order[i];
//		for (int j = 0; j < i; j++) {
//			array2[j] = orders[j];
//		}

	}

	public static double tax(double price, int quantity) {
		double tax = 0;
		double amounts = amount(price, quantity);
		tax = amounts * 8.0265;
		return tax;
	}

	public static double amount(double price, int quantity) {
		double amount = price * quantity;
		return amount;
	}

	private static void showCheck(Order[] array) {

		System.out.println("enter server name:");
		String sName = kb.next();
		System.out.println("Seoul Restaurant \n (631)123-4567 \n");
		System.out.println("   server name:  " + sName);
		System.out.println(line);
		System.out.println("Item   Item Description   Qty   Unit Price   Amount");
		System.out.println(line);
		double subTotal = 0;
		for (int i = 1; i < array.length; i++) {
			tax(array[i].getUnitPrice(), array[i].getQuantity());
			double amount = amount(array[i].getUnitPrice(), array[i].getQuantity());
			subTotal += amount;
//			System.out.printf("%-4d%-30s%-5d%.2f%.2f", i, array[i].getItemDescription(), array[i].getQuantity(),
//					array[i].getUnitPrice(), array[i]);

			System.out.printf("%-5d%-21s", i, array[i].getItemDescription());
			System.out.printf("%-7d", array[i].getQuantity());
			System.out.printf("%-13.2f", array[i].getUnitPrice());
			System.out.printf("%-4.2f\n", amount);
//			System.out.println(i + "    " + array[i].getItemDescription() + "          " + array[i].getQuantity() + "       "
//					+ array[i].getUnitPrice() + "      " + amount);
//			System.out.println(array[i]);
		}

		double tax = subTotal * 0.080265;
		double total = tax + subTotal;
		System.out.println(line);
		System.out.printf("%-46s%-3.2f\n", "subtotal: ", subTotal);
		System.out.printf("%-46s%-3.2f\n", "tax", tax);
		System.out.printf("%-46s%-3.2f\n", "total", total);

	}

	private static Order[] createOrder() {
		Order[] orders = new Order[10000];
		int r = 1;
		while (true) {
			System.out.println("place your order: E1, E2....");
			String item = kb.next();
			System.out.println("enter the quantity: ");
			int quantity = kb.nextInt();
			String item2 = getItem(item);
			double price = getPrice(item);
			Order order = new Order(item2, quantity, price);
			orders[r] = order;
			r++;
			System.out.println("do you want another item? Y or N");
			String ans = kb.next();
			if (ans.contentEquals("N")) {
				break;
			}
		}
		Order[] orders2 = new Order[r];
		for (int j = 1; j < r; j++) {
			orders2[j] = orders[j];
		}
		return orders2;
	}

	public static double getPrice(String item) {
		double price = 0;
		switch (item) {
		case "E1":
			price = 14.99;
			break;
		case "E2":
			price = 11.99;
			break;
		case "E3":
			price = 8.99;
			break;
		case "E4":
			price = 10.99;
			break;
		case "E5":
			price = 9.99;
			break;
		case "E6":
			price = 9.49;
			break;
		case "E7":
			price = 8.99;
			break;
		case "E8":
			price = 8.99;
			break;
		case "E9":
			price = 9.99;
			break;
		case "E10":
			price = 9.99;
			break;
		default:
			price = 0;
		}
		return price;
	}

	public static String getItem(String item) {
		String it = "";
		switch (item) {
		case "E1":
			it = "Kalbi";
			break;
		case "E2":
			it = "Special Box";
			break;
		case "E3":
			it = "Jopche";
		case "E4":
			it = "Beef Skillet";
			break;
		case "E5":
			it = "Bi Bim Bop";
			break;
		case "E6":
			it = "Bulkogi";
			break;
		case "E7":
			it = "Pork Bulkogi";
			break;
		case "E8":
			it = "Hot Spicy Chicken";
			break;
		case "E9":
			it = "Hot Spicy Squid or Pork";
			break;
		case "E10":
			it = "Yooka Ka Jang";
			break;
		default:
			it = "nothing";
		}
		return it;
	}

	public static void showMenu() {
		System.out
				.println("        Korean Cuisine \n \tSEOUL RESTAURANT \n 2625 North HillField Road Layton, UT 84041");
		System.out.println("       (801)776-7066\n" + line);
		System.out.println("KOREAN DISHES:\n" + line);
		String fmt = "%-6s%-35s%-10.2f\n";
		System.out.printf(fmt, "E1", "kalbit", 14.99);
		System.out.printf(fmt, "E2", "Special Box- (Chicken/Beef/Pork)", 11.99);
		System.out.printf(fmt, "E3", "Jopche", 8.99);
		System.out.printf(fmt, "E4", "Beef Skillet", 10.99);
		System.out.printf(fmt, "E5", "Bi Bim Bop", 9.99);
		System.out.printf(fmt, "E6", "Bulkogi", 9.49);
		System.out.printf(fmt, "E7", "Pork Bulkogi", 8.99);
		System.out.printf(fmt, "E8", "Hot Spicy Chicken", 8.99);
		System.out.printf(fmt, "E9", "Hot Spicy Squid or Pork", 9.99);
		System.out.printf(fmt, "E10", "Yooka Ka Jang", 9.99);
	}
}
