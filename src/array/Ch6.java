package array;

import java.util.Scanner;

public class Ch6 {

	private static String dashLine = "----------------------------";
	private static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			showMenuItems();
			String serverName = getServerName();
	//
			int tableNumber = getTableNumber();
			final int maxItems = 100;
			int[] quantitys = new int[maxItems];
			String[] descriptions = new String[maxItems];
			double[] subtotals = new double[maxItems];
			 int count =0;
			double grandTotal = 0.0;
			double[] prices = new double[maxItems];
			while (true) {
				String longString = getOrder();
				int commaPosition = longString.indexOf(',');
				String itemNumber = longString.substring(0, commaPosition);
				if(itemNumber.contentEquals("0")) {
					break;
				}
				
				quantitys[count] = Integer.parseInt(longString.substring(commaPosition + 2));
				longString = getItemPriceAndDescription(itemNumber);
				descriptions[count] = longString.substring(0, longString.indexOf(","));
				prices[count] = Double.parseDouble(longString.substring(longString.indexOf(",") + 2));
				subtotals[count] = getSubtotal(prices[count], quantitys[count]);
				grandTotal += subtotals[count];
				count++;
			}
			showCheck(serverName, tableNumber, descriptions, quantitys, subtotals, grandTotal, count);
//			showMenuItems();
//			String serverName = getServerName();
	//
//			int tableNumber = getTableNumber();
//			System.out.print(serverName + ": at Table " + tableNumber);
		}
		
		public static double getSubtotal(double price, int quantity) {
			return price * quantity;
		}
		
		public static void showCheck(String serverName, int tableNumber, String description[], int quantity[], double subtotal[], double grandTotal,int count) {
			double TAX_RATE = 0.08625;
			String checkFormat = "%-4s%-10S%4d%10.2f\n";
			String checkDashLine = "----------------------------";
			showHeader();
			System.out.println("Server Name: " + serverName);
			System.out.println("Table Number: " + tableNumber);
			System.out.println(checkDashLine);
			for(int i = 0; i < count; i++) {
			System.out.printf(checkFormat, (i + 1+"."), description[i], quantity[i], subtotal[i]);
			}
			System.out.println(checkDashLine);
			System.out.printf("%-3S%25.2f\n", "TAX", grandTotal * TAX_RATE);
			System.out.printf("%-8S%20.2f\n", "Total", (grandTotal + (grandTotal * TAX_RATE)));
			System.out.println(checkDashLine);
		}
		
		
		
		

		public static String getItemPriceAndDescription(String itemAsString) {
			int itemNumber = Integer.parseInt(itemAsString);
			double price;
			String description;
			if (itemNumber == 1) {
				price = 1.99;
				description = "Milk";
			} else if (itemNumber == 2) {
				price = 2.99;
				description = "O.J.";
			} else if (itemNumber == 3) {
				price = 1.99;
				description = "Water";
			} else if (itemNumber == 4) {
				price = 2.99;
				description = "Soda";
			} else if (itemNumber == 0) {
				return null;
			} else {
				price = 0.0;
				description = "None";
			}
			
			return description + ", " + price;

		}

		public static String getOrder() {
			int quantity;
			int itemNumber;
			String itemNumberAndQuantity = "";
			System.out.println("Enter the order by providing item number: ");
			itemNumber = kb.nextInt();
			itemNumberAndQuantity = itemNumberAndQuantity + itemNumber + ", ";
			if(itemNumber != 0) {
			System.out.println("Enter the quantity: ");
			quantity = kb.nextInt();
			itemNumberAndQuantity = itemNumberAndQuantity + quantity;
			}
			return itemNumberAndQuantity;
			
		}

		public static void showMenuItems() {
			String menuItemFormat = "%-4S%-10S%10.2f\n";
			showHeader();
			System.out.printf(menuItemFormat, "1.", "Milk", 1.99);
			System.out.printf(menuItemFormat, "2.", "O.J", 2.99);
			System.out.printf(menuItemFormat, "3.", "Water", 1.99);
			System.out.printf(menuItemFormat, "4.", "Soda", 2.99);
			System.out.println(dashLine);
		}

		public static String getServerName() {
			// step 1 get server name
			
			System.out.println("Enter server's name: ");
			return kb.nextLine();
		}

		public static void showHeader() {
			System.out.println("       ABCD Restaurant");
			System.out.println("       123 Main Street");
			System.out.println("       Selden, NY 11784");
			System.out.println("        (631)123-4567");
			System.out.println(dashLine);
		}

		public static int getTableNumber() {
			// step 1 get server name
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter the table number: ");
			return kb.nextInt();
		}
	}


