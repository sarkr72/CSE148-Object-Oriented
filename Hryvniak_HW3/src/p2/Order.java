package p2;

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
		
}
