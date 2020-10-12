package com.java.assign1;

public class Assign1a {
	static int getMissingNo(int array[], int n) {
		if (n != 0) {
			int i, total;
			total = (n + 1) * (n + 2) / 2;
			for (i = 0; i < n; i++)
				total -= array[i];
			return total;
		} else
			throw new RuntimeException("Empty Array Exception");
	}

}
