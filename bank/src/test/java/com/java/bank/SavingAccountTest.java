package com.java.bank;

import org.junit.Test;
import junit.framework.TestCase;

public class SavingAccountTest extends TestCase {

	@Test
	void test1() {
		SavingAccount acc1 = new SavingAccount("Dinky", 2000);
		assertEquals("Dinky", acc1.getName());
		assertEquals(2000, acc1.getBalance());
		assertEquals(1000, acc1.getAccountNo());
	}

	@Test
	void test2() {
		SavingAccount acc1 = new SavingAccount("Dinky", 2000);
		SavingAccount acc2 = new SavingAccount("John");
		assertEquals(1002, acc2.getAccountNo());
	}

	@Test
	void test3() {
		SavingAccount acc1 = new SavingAccount("Dinky", 2000);
		acc1.deposit(1000);
		assertEquals(3000, acc1.getBalance());
	}

	@Test
	void test4() {
		SavingAccount acc1 = new SavingAccount("Dinky", 2000);
		try {
			acc1.withdraw(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(1000, acc1.getBalance());
	}

	@Test
	void test5() {
		SavingAccount acc1 = new SavingAccount("Dinky", 2000);
		SavingAccount acc2 = new SavingAccount("John");
		assertEquals(true, PaymentGateway.transfer(acc1, acc2, 1000));
	}

	@Test
	void test6() {
		SavingAccount acc1 = new SavingAccount("Dinky");
		SavingAccount acc2 = new SavingAccount("John", 2000);
		assertEquals(false, PaymentGateway.transfer(acc1, acc2, 1000));
	}

	@Test
	void test7() {
		SavingAccount acc1 = new SavingAccount("Dinky");
		assertThrows(Exception.class, () -> acc1.withdraw(1000));
	}

}
