package com.java.lambda;

import junit.framework.TestCase;
import org.junit.Test;

public class FileNameFilterTest extends TestCase {
	@Test
	void test() {
		assertEquals(4,FileNameFilter.filename("E://",".txt"));
	}

}
