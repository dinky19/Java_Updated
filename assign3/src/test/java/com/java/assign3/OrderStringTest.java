package com.java.assign3;

import junit.framework.TestCase;

public class OrderStringTest extends TestCase {
	@Test
	void test2() {		
		assertEquals(OrderString.order("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");

	}
}
