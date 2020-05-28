package p5;

public class Demo {

	public static void main(String[] args) {
		CheckingAccount ca1 = new CheckingAccount("checking A", 100);
		CheckingAccount ca2 = new CheckingAccount("checking B", 200);
		
		SavingsAccount sa1 = new SavingsAccount("saving A", 300);
		SavingsAccount sa2 = new SavingsAccount("savong B", 400);
		
		BankBag bk = new BankBag(100);
		
		bk.insertAccount(ca1);
		bk.insertAccount(ca2);
		bk.insertAccount(sa1);
		bk.insertAccount(sa2);
		bk.display();
		
		bk.removeAccByAccNumber(2);
		System.out.println("after remove");
		bk.display();
		
		System.out.println();
		System.out.println(" find 2nd savingsaccount" + bk.findAccByAccNumber(4));
	}

}
