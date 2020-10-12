package com.java.assign1;

import junit.framework.TestCase;
import org.junit.Test;


public class Assign1aTest extends TestCase {
	

		@Test
		void testMissingNumber() {
			int actual=Assign1a.getMissingNo(new int[]{1,2,3,4,6,7,8},7);
			assertEquals(5,actual);
		}

	}
}
