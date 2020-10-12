package com.java.lambda;

import junit.framework.TestCase;
import org.junit.Test;

public class FileFilterTest extends TestCase {
		
		@Test
		void test2() {
			assertEquals(11,FileFilter.subdir("E://"));
		}
		@Test
		void test1() {
			assertEquals(28,FileFilter.subdir("E://EVS"));
		}

}