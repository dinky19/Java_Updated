package com.java.assign4;

public class Cmd {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 0; i < args.length; i++)
			sum += Integer.parseInt(args[i]);
		System.out.println(sum);
	}
}
