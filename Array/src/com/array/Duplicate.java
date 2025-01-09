package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {

//	public static void main(String[] args) {
//
//		int[] a = { 3, 2, 4, 5, 2, 3, 7 };
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i] == a[j]) {
//                      System.out.println(a[i]);
//                      break;
//				}
//			}
//		}
//	}

	// public static ArrayList<Integer> dupli(int[] a) {

	// 	ArrayList<Integer> l = new ArrayList<>();

	// 	for (int i = 0; i < a.length; i++) {

	// 		for (int j = i + 1; j < a.length; j++) {

	// 			if (a[i] == a[j]) {
	// 				l.add(a[i]);
	// 				break;
	// 			}
	// 		}
	// 	}

	// 	return l;

	// }

	// public static void main(String[] args) {

	// 	int[] a = { 2, 1, 3, 2, 4, 5, 4, 1 };
	// 	System.out.println(Arrays.toString(a));

	// 	ArrayList<Integer> l = dupli(a);
	// 	System.out.println(l);

	// }

	public static void dupli(int[] a) {

		HashSet<Integer> hs = new LinkedHashSet<>();

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					hs.add(a[i]);
					break;
				}
			}
		}

		System.out.println(hs);

	}

	public static void main(String[] args) {

		int[] a = { 2, 1, 3, 2, 4, 5, 4, 1 };
		System.out.println(Arrays.toString(a));

		 dupli(a);
		

	}

}
