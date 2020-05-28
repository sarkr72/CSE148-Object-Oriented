package p7;

import java.io.Serializable;

public class BankBag implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8830504310193232977L;
	private Bank[] accounts;
	private int nElems;
	public BankBag(int max) {
		super();
		accounts = new Bank[max];
		nElems = 0;
	}
	
	public void insertAccount(Bank account) {
		accounts[nElems++] = account;
	}
	
	public Bank findAccByAccNumber(int id) {
		for(int i =  0; i < nElems; i++) {
			if(id == accounts[i].getId()) {
				return accounts[i];
			}
		}
		return null;
	}
	
	public Bank removeAccByAccNumber(int id) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (id == accounts[i].getId()) {
				break;
			}
		}
		Bank temp = accounts[i];
		if (i == nElems) {
			return null;
		} else {
			for (int j = i; j < nElems - 1; j++) {
				accounts[j] = accounts[j + 1];
			}
		}
		nElems--;
		return temp;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(accounts[i]);
		}
	}
	
}
