package com.array;


import java.util.Arrays;


public class Descending {
	
	public static int[] asc(int[] a) {

		
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a;

	}

	public static void main(String[] args) {
		

		int[] a = { 4, 3, 5, 2, 5, 2 ,1};


		System.out.println(Arrays.toString(a));

		asc(a);
		
		System.out.println(Arrays.toString(a));
	}

}
