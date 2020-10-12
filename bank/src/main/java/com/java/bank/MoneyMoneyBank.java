package com.java.bank;

public class MoneyMoneyBank {
	public static void main(String[] args) {
		try {
			SavingAccount acc1=new SavingAccount("Dinky",7000);
			SavingAccount acc2=new SavingAccount("Jhon");
			acc1.display();
			acc2.display();
			System.out.println("After deposit: ");
			acc1.deposit(1000);
			acc1.display();
			acc2.deposit(3000);
			acc2.display();
			System.out.println("After withdrawl: ");
			acc1.withdraw(2000);
			acc1.display();
			acc2.withdraw(3000);
			acc2.display();
			SavingAccount.getNextAccountNo();
			PaymentGateway.transfer(acc1, acc2, 1000);			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
}
}