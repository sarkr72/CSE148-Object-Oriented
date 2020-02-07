package p4;

public class Book {

	private String title;
	private double price;
	
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public String setTitle(String title) {
		return this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public double setPrice(double price) {
		return this.price = price;
	}
}
