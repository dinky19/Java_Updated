package com.java.FileIO;

import junit.framework.TestCase;
import java.io.*;
import org.junit.Test;

public class WordCountTest extends TestCase {

	@Test
	void test1() throws IOException {
		assertEquals(14, WordCount.count(new File("X://LineWord.txt")));
	}

	@Test
	void test2() throws IOException {
		assertEquals(0, WordCount.count(new File("X://Empty.txt")));
	}
}
