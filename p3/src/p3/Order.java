package p3;

public class Order {

	public String description;
	public int quantity;
	public double price;
	public int extra;
	public double extraPrice;
	
	public Order(String description, int quantity, double price) {
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Order(String description, int quantity, double price, int extra, double extraPrice) {
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.extra = extra;
		this.extraPrice = extraPrice;
	}

	public String toString() {
		return "Order [description=" + description + ", quantity="
				+ quantity + ", price=" + price + ", extra=" + extra
				+ ", extraPrice=" + extraPrice + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getExtra() {
		return extra;
	}

	public void setExtra(int extra) {
		this.extra = extra;
	}

	public double getExtraPrice() {
		return extraPrice;
	}

	public void setExtraPrice(double extraPrice) {
		this.extraPrice = extraPrice;
	}
}
