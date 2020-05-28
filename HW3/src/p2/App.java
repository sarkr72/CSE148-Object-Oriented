package p2;

import java.util.Scanner;
// PRACTICE DECIMAL TO BINARY ETC. AND DATE
public class App {
private static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1 = new Item(1, "Kalbi", 14.99);
		Item i2 =  new Item(2, "Special Box-Chicken/Beef/Pork", 11.99);
		Item i3 = new Item(3, "Jophe", 8.99);
		Item i4 = new Item(4, "Beef Skillet", 10.99);
		Item i5 = new Item(5, "Bi Bim Bop", 9.99);
		Item i6 = new Item(6, "Bulkogi", 9.49);
		Item i7 = new Item(7, "Pork Bulkogi", 8.99);
		Item i8 = new Item(8, "Hot Spicy Chicken", 8.99);
		Item i9 = new Item(9, "Hot Spicy Squid", 9.99);
		Item i10 = new Item(10, "Yook Ke Jang", 9.99);
		
		Menu menu = new Menu(50);
		menu.insertItem(i1);
		menu.insertItem(i2);
		menu.insertItem(i3);
		menu.insertItem(i4);
		menu.insertItem(i5);
		menu.insertItem(i6);
		menu.insertItem(i7);
		menu.insertItem(i8);	
		menu.insertItem(i9);
		menu.insertItem(i10);
		
		while(true) {
			menu.showMenu();
			Order order = new Order(10, menu);
			order.createOrder();
			order.showCheck();
			System.out.print("---------------------------------------------------\nMore order?");
			String reply = kb.next();
			if(reply.contentEquals("N")) {
				break;
			}
	}
	}
}
