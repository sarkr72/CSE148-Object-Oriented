package p2;

public class Item {

	private int itemNumbers;
	private String itemDescription;
	private double itemPrice;
	private int itemQuantity;
	private double itemCharge;
	
	public Item(int itemNumbers, String itemDescription, double itemPrice, int itemQuantity, double itemCharge) {
		super();
		this.itemNumbers = itemNumbers;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		this.itemCharge = itemCharge;
	}
	
	public Item(int itemNumbers, String itemDescription, double itemPrice) {
		super();
		this.itemNumbers = itemNumbers;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
	}
	
	public int getItemNumbers() {
		return itemNumbers;
	}

	public void setItemNumbers(int itemNumbers) {
		this.itemNumbers = itemNumbers;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemCharge() {
		return itemCharge;
	}

	public void setItemCharge(double itemCharge) {
		this.itemCharge = itemCharge;
	}
}
