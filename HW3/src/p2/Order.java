package p2;

import java.util.Scanner;

public class Order {
	private String line = "-------------------------------------------";
	private Scanner kb = new Scanner(System.in);
	private Item[] order;
	private int numberOfItems;
	private double subTotal;
	private double tax;
	private double total;
	private Menu menu;
	private int orderId;
	private int idCounter;

	public Order(int maxSize, Menu menu) {
		orderId = idCounter++;
		order = new Item[maxSize];
		numberOfItems = 0;
		this.menu = menu;
	}

	public Item[] createOrder() {
		while (true) {
			System.out.println("enter item number: 1,2...");
			int ans = kb.nextInt();
			System.out.println("enter the quantity: ");
			int q = kb.nextInt();
			Item item = menu.searchItems(ans);
			item.setItemQuantity(q);
			item.setItemCharge(item.getItemPrice() * q);
			order[numberOfItems++] = item;
			System.out.println("do you want more item? Y or N");
			String ans1 = kb.next();
			if (ans1.contentEquals("N")) {
				break;
			}
		}
		return order;
	}

	public Item[] getItems() {
		return order;
	}

	public void setOrder(Item[] order) {
		this.order = order;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public void showCheck() {
		System.out.println("enter server name:");
		String sName = kb.next();
		System.out.println("      Seoul Restaurant \n (631)123-4567 \n");
		System.out.println("   server name:  " + sName);
		System.out.println(line);
		System.out.println("Item   Item Description   Qty   Unit Price   Amount");
		System.out.println(line);
		for (int i = 0; i < numberOfItems; i++) {
			subTotal =+ order[i].getItemCharge();
		}
		tax =+ subTotal * 0.08625;
		total =+ tax + subTotal;
		for (int i = 0; i < numberOfItems; i++) {
			System.out.printf("%-4d%-10s%10.2f%5d%10.2f\n", order[i].getItemNumbers(), order[i].getItemDescription(),
					order[i].getItemPrice(), order[i].getItemQuantity(), order[i].getItemCharge());
		}
		System.out.println("------------------------------------------");
		System.out.printf("%-10s%29.2f\n", "Subtotal", subTotal);
		System.out.printf("%-10s%29.2f\n", "Taxes", tax);
		System.out.printf("%-10S%29.2f\n", "Total", total);
	}

}
