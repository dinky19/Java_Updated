package com.java.assign1;

import org.junit.Test;

import junit.framework.TestCase;

public class Assign1dTest extends TestCase {


		@Test
		void test() {
			int[] actual = Assign1d.zeroAtEnd(new int[] {1, 2, 0, 4, 3, 0, 5, 0});
			int[] expected={1, 2, 5, 4, 3, 0, 0,0};
			assertEquals(expected,actual);
		}

		@Test
		void testZeroPos() {
			int[] actual = Assign1d.zeroAtEnd(new int[] {1,2,0,0,4,2});
			int[] expected= {1,2,2,4,0,0};
			assertEquals(expected,actual);
		}
		
		@Test
		void testZeroAtEnd() {
			int[] actual = Assign1d.zeroAtEnd(new int[] {1, 2, 5, 4, 3, 0, 0, 0});
			int[] expected={1, 2, 5, 4, 3, 0, 0,0};
			assertEquals(expected,actual);
		}
		
		@Test
		void testZeroAtStart() {
			int[] actual = Assign1d.zeroAtEnd(new int[] {0,0,1,2,3});
			int[] expected={3,2,1,0,0};
			assertEquals(expected,actual);
		}
		
		@Test
		void testNoZero() {
			int[] actual = Assign1d.zeroAtEnd(new int[] {4,6,7,1,2,3});
			int[] expected={4,6,7,1,2,3};
			assertEquals(expected,actual);
		}
		
		@Test
		void testZeroNegative() {
			int[] actual = Assign1d.zeroAtEnd(new int[] {-1, -2, 0, 4, 3, 0, 0, 0});
			int[] expected= {-1, -2, 3, 4, 0, 0, 0,0};
			assertEquals(expected,actual);
		}
		

	}
}
