package p2;

public class Menu {

	private Item[] menu;
	private int numberOfItems;
	private int maxMenuItems;
	
	public Menu(int maxMenuItems) {
		super();
		menu = new Item[maxMenuItems];
		numberOfItems = 0;
	}
	
	public Item insertItem(Item item) {
		menu[numberOfItems++] = item;
		return item;
	}
	public Item[] getItems() {
		return menu;
	}

	public void setItems(Item[] items) {
		this.menu = items;
	}

	public int getNumberOfOrder() {
		return numberOfItems;
	}

	public void setNumberOfOrder(int numberOfOrder) {
		this.numberOfItems = numberOfOrder;
	}

	public int getMaxMenuItems() {
		return maxMenuItems;
	}

	public void setMaxMenuItems(int maxMenuItems) {
		this.maxMenuItems = maxMenuItems;
	}

	private Item removeItem(int itemNumber) {
		int i;
		for(i = 0; i < numberOfItems; i++) {
			if(itemNumber == menu[i].getItemNumbers()) {
				break;
			}
		}
		if(i == numberOfItems) {
			return null;
		}else {
			Item temp = menu[i];
			for(int j = i; j < numberOfItems - 1; j++) {
				menu[j] = menu[j+1];
			}
			numberOfItems--;
			return temp;
		}
		
	}
	public void showMenu(){
		for(int i = 0; i < numberOfItems; i++) {
			System.out.printf("%-5d%-10s%10.2f\n", menu[i].getItemNumbers(), menu[i].getItemDescription(), menu[i].getItemPrice());
		}
	}

	public Item searchItems(int itemNumber) {
		for(int i = 0; i < numberOfItems; i++) {
			if(itemNumber == menu[i].getItemNumbers()) {
				return menu[i];
			}
		}
		return null;
	}
	
}
