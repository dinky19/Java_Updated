package com.java.assign1;

import java.util.ArrayList;
import java.util.Arrays;

public class Assign1c {

	public static ArrayList CommonElement(int[] arr1, int[] arr2, int arr3[]) {

		ArrayList common = new ArrayList(1);
		int el = 0, c = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					for (int k = 0; k < arr3.length; k++) {
						if (arr1[i] == arr3[k]) {
							el = arr1[i];
							if (!common.contains(el)) {

								common.add(el);
								c++;
								break;
							}
						}
					}
					break;
				}
			}
		}
		return common;
	}
}
