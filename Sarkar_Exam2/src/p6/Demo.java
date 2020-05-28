package p6;

public class Demo {

	public static void main(String[] args) {
		CheckingAccount ca1 = new CheckingAccount("john cena", 1000);
		CheckingAccount ca2 = new CheckingAccount("the rock", 2000);
		
		SavingsAccount sa1 = new SavingsAccount("rinku sarkar", 3000);
		SavingsAccount sa2 = new SavingsAccount("ms dhoni", 4000);
		
		ca1.withdraw();
	}

}
