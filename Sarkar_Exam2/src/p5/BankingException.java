package p5;

public class BankingException extends Exception{

	public BankingException(String message) {
		super("\n" + message);
	}
}
