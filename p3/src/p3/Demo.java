package p3;
//let me know here if u got this
import java.util.Scanner;

public class Demo {
	private static String line = "---------------------------------------------------";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		final int numMenuItems = 14;
		boolean takingOrders = true;
		Menu m1 = new Menu('A', 1, "Vegetable Samosa ", 6.00);
		Menu m2 = new Menu("Cucumber and Mint Raita ", 3.00);
		Menu m3 = new Menu('A', 2, "Ghobi Chili        ", 10.00);
		Menu m4 = new Menu("Mango Chutney                ", 2.00);
		Menu m5 = new Menu('A', 3, "Alu Tikki Chat         ", 7.00);
		Menu m6 = new Menu('A', 4, "Mixed Vegetable Pakora ", 8.00);
		Menu m7 = new Menu('A', 5, "Samosa Chat         ", 7.00);
		Menu m8 = new Menu('A', 6, "Bombay Phel Puri ", 7.00);
		Menu m9 = new Menu("Papadum                ", 1.50);
		Menu m10 = new Menu('E', 7, "Paneer Makhani        ", 15.00);
		Menu m11 = new Menu('E', 8, "Malai Kofta        ", 15.00);
		Menu m12 = new Menu("Mixed Vegetable Pickle ", 2.00);
		Menu m13 = new Menu('E', 9, "Dal Makhni        ", 13.00);
		Menu m14 = new Menu('E', 10, "Chana Pindi        ", 13.00);
		Menu[] menuList = { m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14 };

		while (takingOrders == true) {
//			Order[] orders = new Order[o.length];
			showMenu(numMenuItems, menuList);
			Order[] o = createOrder(menuList);

//			for (int i = 0; i < orders.length; i++) {
//				orders[i] = createOrder(menuList);
//				if (orders[i] == null) break;
//			}
//			for(int j = 0; j < o.length; j++) {
//				
//			}
			showCheck(o, menuList);

			System.out.print("\nTake another table's order? (y/n) >> ");
			String ans = kb.next();
			System.out.println("\n\n\n");
			if (ans.equalsIgnoreCase("n"))
				takingOrders = false;
		}
	}

//	--------------------------------------------------------------------------------------------------
//	Item Item Description Qty Unit Price Amount
//	--------------------------------------------------------------------------------------------------------
//	1. Beef Skillet 2 9.99 19.98
//	2. Steak 1 15.99 15.99
//	--------------------------------------------------------------------------------------------------------
//	Subtotal 35.97
//	Tax (8.0625%) 3.10
//	Total 39.07

	private static void showCheck(Order[] orders, Menu[] menuLis) {
		System.out.println("\n\n\t\tRaga Indian Restaurant\n\t\t    130 Old Town Rd\n\t\tEast Setauket, NY 11733"
				+ "\n\t\t     (631)689-7242\n-------------------------------------------------------"
				+ "\n-------------------------------------------------------\n"
				+ "Item    Item Description    Qty   Unit Price     Amount"
				+ "\n-------------------------------------------------------");
		double subTotal = 0;
		for (int i = 1; i < orders.length; i++) {
			double amount = amount(orders[i].getPrice(), orders[i].getQuantity());
			tax(orders[i].getPrice(), orders[i].getQuantity());
//			System.out.printf("%8d%22s%6d%15.fd%6.2f", (i + 1), orders[i].description, orders[i].quantity, orders[i].price, (orders[i].price * orders[i].quantity));
			subTotal += amount;
			System.out.printf("%-5d%-21s", i, orders[i].getDescription());
			System.out.printf("%-7d", orders[i].getQuantity());
			System.out.printf("%-13.2f", orders[i].getPrice());
			System.out.printf("%-4.2f\n", amount);
			System.out.println(line);
			

		}
		double tax = subTotal * 0.080265;
		double total = tax + subTotal;
		System.out.println(line);
		System.out.printf("%-46s%-3.2f\n","subtotal: ", subTotal);
		System.out.printf("%-46s%-3.2f\n", "tax", tax);
		System.out.printf("%-46s%-3.2f\n", "total", total);
		System.out.println(line);
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

	private static Order[] createOrder(Menu[] menuList) {
		int sel;
		int quant;
		String des = "";
		double price = 0;
		int extra = 0;
		double extraPrice = 0;
		Scanner kb = new Scanner(System.in);
		Order[] orders = new Order[1000000];
		int r = 1;

		while (true) {

			System.out.print("Make a selection (1-10 / 0 to close check) >> ");
			sel = kb.nextInt();
			kb.nextLine();
			if (sel == 0)
				return null;
			System.out.print("How many? >> ");
			quant = kb.nextInt();
			kb.nextLine();
			if (sel == 1) {
				System.out.print("How many raita? >> ");
				extra = kb.nextInt();
				extraPrice = menuList[1].price;
				kb.nextLine();
			} else if (sel == 2) {
				System.out.print("How many chutney? >> ");
				extra = kb.nextInt();
				extraPrice = menuList[3].price;
				kb.nextLine();
			} else if (sel == 6) {
				System.out.print("How many papadum? >> ");
				extra = kb.nextInt();
				extraPrice = menuList[8].price;
				kb.nextLine();
			} else if (sel == 8) {
				System.out.print("How many vegetables? >> ");
				extra = kb.nextInt();
				extraPrice = menuList[11].price;
				kb.nextLine();
			}
			if (sel == 1) {
				des = menuList[0].des;
				price = menuList[0].price;
			} else if (sel == 2) {
				des = menuList[2].des;
				price = menuList[2].price;
			} else if (sel == 3) {
				des = menuList[4].des;
				price = menuList[4].price;
			} else if (sel == 4) {
				des = menuList[5].des;
				price = menuList[5].price;
			} else if (sel == 5) {
				des = menuList[6].des;
				price = menuList[6].price;
			} else if (sel == 6) {
				des = menuList[7].des;
				price = menuList[7].price;
			} else if (sel == 7) {
				des = menuList[9].des;
				price = menuList[9].price;
			} else if (sel == 8) {
				des = menuList[10].des;
				price = menuList[10].price;
			} else if (sel == 9) {
				des = menuList[12].des;
				price = menuList[12].price;
			} else if (sel == 10) {
				des = menuList[13].des;
				price = menuList[13].price;
			}
			Order newOrder = new Order(des, quant, price, extra, extraPrice);
//			System.out.println();
			orders[r] = newOrder;
			r++;
			System.out.println("do you want another item? Y  or N");
			String ans = kb.next();
			if (ans.contentEquals("N")) {
				break;
			}
//			return orders;
		}
		Order[] order = new Order[r];
		for(int i = 0; i < r; i++) {
			order[i] = orders[i];
		}
		return order;
	}

	private static void showMenu(int numMenuItems, Menu[] menuList) {
		// String menuFormat = "%1s%-6s%-25s%5s";
		// String des = "";
		// double price = 0;
		// int num = 0;
		// String type = "";
		System.out.println("\t\tRaga Indian Restaurant\n\t\t    130 Old Town Rd\n\t\tEast Setauket, NY 11733"
				+ "\n\t\t     (631)689-7242\n-------------------------------------------------------"
				+ "\n-------------------------------------------------------\n  APPETIZERS"
				+ "\n-------------------------------------------------------");
		for (int i = 0; i < numMenuItems; i++) {
			if (i == 0 || i == 2 || (i >= 4 && i < 8) || i == 9 || i == 10 || i == 12 || i == 13) {
				System.out.println("" + menuList[i].type + menuList[i].num + "\t" + menuList[i].des + "\t\t"
						+ menuList[i].price + "0");
			} else
				System.out.println("\t  " + menuList[i].des + "\t" + menuList[i].price + "0");
			if (i == 8)
				System.out.println("-------------------------------------------------------\n   ENTREES"
						+ "\n-------------------------------------------------------");
		}
		System.out.println("\n-------------------------------------------------------\n");
	}

}
