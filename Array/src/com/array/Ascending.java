package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ascending {

	public static int[] asc(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;

	}

	public static void main(String[] args) {

		int[] a = { 4, 3, 5, 2, 5, 2, 1 };

		System.out.println(Arrays.toString(a));
		
		asc(a);
		
		System.out.println(Arrays.toString(a));
	}
	
//	public static void main(String[] args) {
//		
//		int[] a = {8,3,4,2,1,4,2,3};
//		
//		Arrays.sort(a);
//		
//		HashSet<Integer> hs = new LinkedHashSet<Integer>();
//		
//		for(int n:a) {
//			hs.add(n);
//		}
//		System.out.println(hs);
//		System.out.println(Arrays.toString(a));
//	}

}
