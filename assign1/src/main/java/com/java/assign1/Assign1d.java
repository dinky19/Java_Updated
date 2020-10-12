package com.java.assign1;

public class Assign1d {

	public static int[] zeroAtEnd(int[] arr) {
		int start = 0, end = arr.length - 1;

		while (start < end) {
			if (arr[start] != 0)
				start++;
			if (arr[end] == 0)
				end--;
			if (arr[start] == 0 && arr[end] != 0) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		return arr;

	}
}