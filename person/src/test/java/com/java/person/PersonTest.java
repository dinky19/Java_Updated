package com.java.person;

import java.text.ParseException;
import org.junit.Test;

import junit.framework.TestCase;
public class PersonTest extends TestCase {

	@Test
	void Constructor() throws ParseException {
		Person person = new Person("Ram", 5, 6, 1980);
		assertEquals("Ram", person.getName());
		assertEquals("05/06/1980", person.getDob());
	}

	@Test
	void olderPerson1() throws ParseException {
		Person person1 = new Person("Ram", 5, 6, 1980);
		Person person2 = new Person("Shyam", 2, 3, 1987);
		assertEquals("Ram is older than Shyam by 6 Years, 8 Months, 25 Days", person1.olderOne(person2));
	}
}
