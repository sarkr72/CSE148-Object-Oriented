package p6;

import java.util.Scanner;

import p4.BankingException;

public class SavingsAccount extends Bank {
	Scanner kb = new Scanner(System.in);
	private double balance;
	private int id;
	
	
	public SavingsAccount (String name, double balance) {
		super(name);
		this.balance = balance;
	}
	
	@Override
	public void deposit() {
		System.out.println("enter the deposit amount:");
		double amount = kb.nextDouble();
		if (amount <= 0) {
			try {
				throw new OverDraftException("can not deposit zero or negaive amount");
			} catch (OverDraftException e) {
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
		return "SavingsAccount [ " + super.toString() + "balance=" + balance + "]";
	}

}
