package ch_10Ex_7;

import java.util.Scanner;

public class Demo {
	public static Scanner input = new Scanner(System.in);
	public static String Line = "--------------------------";

	public static void main(String[] args) {
		boolean con = true;
		do {
			try {
				Account acc = createAccount();

				int count = 0;
				Account[] accounts = new Account[100];
				while (count < 3) {

					System.out.println(acc);
					accounts[count++] = acc;
				}
				System.out.println();

				for (int i = 0; i < count; i++) {
					System.out.println(accounts[i]);
				}
				System.out.println();
				System.out.println("enter your account Number: ");
				String accNum = input.next();

				for (int i = 0; i < count; i++) {
					if (accNum.matches(accounts[i].getAccountNumber())) {
						while (true) {
							showMenu();
							System.out.println("what do you want to do?");
							int n = input.nextInt();
							if (n == 1) {
								System.out.println("balance is: " + accounts[i].getBalance());
							} else if (n == 2) {
								deposit(accounts[i], accounts[i].getBalance());
							} else if (n == 3) {
								withdraw(acc, accounts[i].getBalance());
							} else if (n == 4) {
								break;
							}
						}
					}
				}
				String[] a = new String[Account.list.size()];
				for (String b : Account.list) {
					System.out.println(b + " ");
				}
				con = false;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		} while (con);
	}

	public static void showMenu() {
		System.out.println("Main Menu");
		System.out.println("1.check balance: \n" + "2.check withdraw \n" + "3.check deposit \n" + "4.exit");
		Account n = new Account();
		System.out.println(n.setFirstName("rinku"));
	}

	public static String receipt(Account acc, String depandwit, double amount, double balance) {
		String receipt = Line + "\n";
		receipt += "address" + "\n";
		receipt += "Name " + acc.getFirstName() + acc.getLastName() + "\n" + "accountNumber is" + acc.getAccountNumber()
				+ "\n" + depandwit + "\t\t " + amount + "\n" + "available money" + "\t\t" + balance + "\n" + Line;
		return receipt;
	}

	public static Account createAccount() {
		System.out.println("ente your name: ");
		String fName = input.next();
		System.out.println("enter your last name");
		String lName = input.next();
		System.out.println("enter ther account number:");
		String accountNumber = input.next();
		System.out.println("enter the initial balance");
		double balance = input.nextDouble();
		Account ac = new Account(fName, lName, accountNumber, balance);
//		ac.deposit(balance);
//		ac.withdraw(balance);
		return ac;
	}

	public static void deposit(Account acc, double balance) {
		System.out.print("enter the deposit: ");
		double deposit = input.nextDouble();
		if (deposit < 0) {
			System.out.println("invalid input");
		} else {
			balance += deposit;
			System.out.println("balance after deposit is " + balance);
			String a = receipt(acc, "deposit", deposit, balance);
			System.out.println(a);
			Account.list.add(a);
		}
//		return null;
	}

	public static void withdraw(Account acc, double balance) {
		System.out.println("enter the withdraw: ");
		double withdraw = input.nextDouble();
		if (withdraw < 0 || withdraw > balance) {
			System.out.println("invalid input");
		} else {
			balance -= withdraw;
			System.out.println("balance after withdraw is :" + balance);
			String a = receipt(acc, "withDraw", withdraw, balance);
			System.out.println(a);
			Account.list.add(a);
		}
	}

//	public void receipt() {
//		System.out.println("address");
//		System.out.println("name" + "\t\t" + name + "\n" + "account Number" + "\t\t" + accountNumber);
//	}

}
