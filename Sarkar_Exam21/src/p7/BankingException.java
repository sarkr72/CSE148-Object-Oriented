package p7;

import java.io.Serializable;

public class BankingException extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -91673238908782169L;

	public BankingException(String message) {
		super("\n" + message);
	}
}
