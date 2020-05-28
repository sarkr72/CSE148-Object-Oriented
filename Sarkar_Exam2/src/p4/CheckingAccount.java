package p4;

import java.util.Scanner;

public class CheckingAccount extends Bank {

	private double balance;

	Scanner kb = new Scanner(System.in);
	private int id;
	private String name;
	
	public CheckingAccount(String name, double  balance) {
		super(name);
		this.balance = balance;
	}



	public int getId() {
		return id;
	}
	@Override
	public void deposit() {
		System.out.println("enter the deposit amount:");
		double amount = kb.nextDouble();
		if (amount <= 0) {
			try {
				throw new BankingException("can not deposit zero or negaive amount");
			} catch (BankingException e) {
				System.out.println(e);
				dsecondChance();
			}
		} else {
			balance += amount;
		}
	}

	private void dsecondChance() {
		System.out.println("enter the amount: ");
		double amount = kb.nextDouble();
		balance += amount;
	}

	@Override
	public void withdraw() {
		System.out.println("enter the withdraw amount:");
		double amount = kb.nextDouble();
		if (amount >= balance) {
			try {
				throw new BankingException("can not overDraft");
			} catch (BankingException e) {
				System.out.println(e);
				wsecondChance();
			}
		} else {
			balance -= amount;
		}
	}

	private void wsecondChance() {
		System.out.println("enter the amount: ");
		double amount = kb.nextDouble();
		balance -= amount;
	}

	@Override
	public String toString() {
		return "CheckingAccount  " + super.toString() + "balance=" + balance + "]";
	}

}
