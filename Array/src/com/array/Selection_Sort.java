package com.array;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {

		int[] a = { 4, 2, 6, 8, 1, 4, 3, 9 };
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			int minindex = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[minindex] > a[j]) {
					minindex = j;
				}
			}
			if (i != minindex) {
				int temp = a[minindex];
				a[minindex] = a[i];
				a[i] = temp;
			}
		}
	}

}
