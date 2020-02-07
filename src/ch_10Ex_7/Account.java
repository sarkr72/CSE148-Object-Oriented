package ch_10Ex_7;

import java.util.ArrayList;

public class Account {
	static ArrayList<String>list = new ArrayList<String>();
	private String firstName;
	private String lastName;
	private String accountNumber;
	private double balance;
	
	public Account() {
		getFirstName();
		getLastName();
		getAccountNumber();
		getBalance();
	}
	
	public Account(String firstName, String lastName, String accountNumber, double balance) throws IllegalArgumentException { 
		if(balance <= 0) {
			throw new IllegalArgumentException("balance must be greater than zero.");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String setFirstName(String fName) {
		return this.firstName = fName;
	}
	
		
	public String toString() {
		return firstName +" " + lastName + " " + accountNumber + " " + balance;
}
}