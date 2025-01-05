package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNo {

	public static ArrayList<Integer> even(int[] a) {

		ArrayList<Integer> l = new ArrayList<>();
		
		for (int i =0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				
				l.add(a[i]);
			}
		}
		return l;
	}

	public static void main(String[] args) {

		int[] a = { 2, 3, 6, 5, 1, 7 };

		System.out.println(Arrays.toString(a));
		ArrayList<Integer> l = even(a);
		System.out.println(l);
	}
	
//	public static void main(String[] args) {
//		
//		int[] a = {1,2,4,3,1,2};
//		
//		System.out.println(Arrays.toString(a));
//		
//		ArrayList<Integer> even = new ArrayList<>();
//		
//		for(int n :a) {
//			if(n%2==0) {
//				even.add(n);
//			}
//		}
//		System.out.println(even);
//	}
	
//	public static int[] even(int[] a) {
//		
//		for (int i =0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				
//				System.out.print(a[i]);
//			}
//		}
//		return a;
//	}
//
//	public static void main(String[] args) {
//
//		int[] a = { 2, 3, 6, 5, 1, 7 };
//
//		System.out.println(Arrays.toString(a));
//		even(a);
//	}

}
