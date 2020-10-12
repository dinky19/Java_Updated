package com.java.employee;

import java.util.Scanner;
import org.junit.Test;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	@Test
	public void getAnnualBasicTest() {
		int id=1,monthlyBasic=20000;
		String name="Dinky";
		Employee emp=new Employee(id,monthlyBasic,name);
		float annual=(float) emp.getAnnualTakeHome();
		assertEquals(annual,359400,0);
	}
	
}
