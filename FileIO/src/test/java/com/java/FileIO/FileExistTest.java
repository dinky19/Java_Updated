package com.java.FileIO;

import junit.framework.TestCase;
import java.io.File;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FileExistTest extends TestCase {

		@Test
		void test1() {
			assertEquals(false,FileExist.fileExists(new File("X://test.txt")));
		}
		
		@Test
		void test2() {
			assertEquals(true,FileExist.fileExists(new File("X://LineWord.txt")));
		}

	}
}
