package com.java.assign1;

import junit.framework.TestCase;
import org.junit.Test;

public class Assign1bTest extends TestCase {
	
		@Test
		void testprint3largest() {
			int[] actual=Assign1b.print3largest(new int[]{5,6,2,4,3,8},6);
			int[] expected= new int[]{8,6,5};
			assertEquals(expected,actual);
		}
		
		@Test
		void testLargest() {
			int[] actual=Assign1b.print3largest(new int[]{-5,-6,-2,-4,-3,-8},6);
			int[] expected= new int[]{-2,-3,-4};
			assertEquals(expected,actual);
		}

		@Test
		void testLargestNum() {
			int[] actual=Assign1b.print3largest(new int[]{-5,6,2,-4,-3,-8},6);
			int[] expected= new int[]{6,2,-3};
			assertEquals(expected,actual);
		}
		
		@Test
		void testLargestFirst() {
			int[] actual=Assign1b.print3largest(new int[]{9,6,2,-4,-3,-8},6);
			int[] expected= new int[]{9,6,2};
			assertEquals(expected,actual);
		}
}
