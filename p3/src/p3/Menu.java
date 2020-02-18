package p3;

public class Menu {

	public char type;
	public int num;
	public String des;
	public double price;
	
	public Menu(char type, int num, String des, double price) {
		this.type = type;
		this.num = num;
		this.des = des;
		this.price = price;
	}
	
	public Menu (String des, double price) {
		this.des = des;
		this.price = price;
	}
}
