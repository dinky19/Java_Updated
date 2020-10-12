package com.java.FileIO;

import junit.framework.TestCase;
import java.io.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LineCountTest extends TestCase {


		@Test
		void test1() throws IOException{
			assertEquals(5,LineCount.count(new File("X://LineWord.txt")));
		}

		@Test
		void test2() throws IOException{
			assertEquals(0,LineCount.count(new File("X://Empty.txt")));
		}
	}
}
