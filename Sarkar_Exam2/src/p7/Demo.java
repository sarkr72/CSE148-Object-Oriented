package p7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6998526804165952268L;

	public static void main(String[] args) throws IOException {
		CheckingAccount ca1 = new CheckingAccount("john cena", 1000);
		CheckingAccount ca2 = new CheckingAccount("the rock", 2000);
		
		SavingsAccount sa1 = new SavingsAccount("rinku sarkar", 3000);
		SavingsAccount sa2 = new SavingsAccount("ms dhoni", 4000);
		
		BankBag bk = new BankBag(100);
		
		bk.insertAccount(ca1);
		bk.insertAccount(ca2);
		bk.insertAccount(sa1);
		bk.insertAccount(sa2);
		bk.display();
		
		try {
			FileOutputStream fos = new FileOutputStream("data.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bk);
			oos.close();
		} catch (NotSerializableException e) {
			System.out.println(e);
		}
	}

}
