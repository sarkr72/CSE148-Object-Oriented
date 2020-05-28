package p8;

import java.io.Serializable;

public class BankingException extends Exception implements Serializable{

	public BankingException(String message) {
		super("\n" + message);
	}
}
