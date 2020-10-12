package com.java.exception;

import org.junit.Test;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	@Test
	void test1() throws NameNotValidException, AgeNotWithinRange{
		Student student=new Student("Dinky",19);
		assertEquals("Dinky",student.getName());
		assertEquals(19,student.getAge());
	}
	@Test
	void test2() {
		assertThrows(AgeNotWithinRange.class,()->new Student("Dinky",34));
	}

	@Test
	void test3() {
		assertThrows(NameNotValidException.class,()->new Student("Dinky#",19));
	}
}
