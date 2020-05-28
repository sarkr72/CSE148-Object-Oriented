package p2;

public class Order {

	private String itemDescription;
	private int quantity;
	private double unitPrice;
	
	public Order(String itemDescription, int quantity, double unitPrice) {
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
//	@Override
//	public String toString() {
//		return  itemDescription + "                      " + quantity + "         " + unitPrice;
//	}
	}
	

