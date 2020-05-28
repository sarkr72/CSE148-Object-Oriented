package p8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5837758984428790703L;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try {
			FileInputStream fos = new FileInputStream("data.dat");
			ObjectInputStream oos = new ObjectInputStream(fos);
			BankBag bk = (BankBag)(oos.readObject());
			bk.display();
			oos.close();
		} catch (NotSerializableException e) {
			System.out.println(e);
		}
	}

}
