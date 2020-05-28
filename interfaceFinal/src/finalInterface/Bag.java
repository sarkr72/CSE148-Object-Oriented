package finalInterface;

public class Bag {

	private SandBInterface[] a;
	private int nElems;
	
	public Bag(int max) {
		a = new SandBInterface[max];
	}
	
	public void insert(SandBInterface s) {
		a[nElems++] = s;
	}
}
