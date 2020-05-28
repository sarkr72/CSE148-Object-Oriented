package p5;

public abstract class Bank {

	private String name;
	private int id;
	private static  int idCoutner = 1;
	
	public Bank(String name) {
		this.name = name;
		this.id = (idCoutner++);
	}
	public abstract void deposit();
	 public abstract void withdraw();
	@Override
	public String toString() {
		return "Bank [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	 
}
