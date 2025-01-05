package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		int[] a = {1,4,2,3,4,5,4,7};
		
		Arrays.sort(a);
		
		HashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		for(int n:a) {
			hs.add(n);
		}
       
		System.out.println(hs);
	}

}
