package com.java.exception;
public class AgeNotWithinRange extends Exception{

	public AgeNotWithinRange(String s) {
		System.out.println(s);
	}
}