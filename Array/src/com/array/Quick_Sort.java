package com.array;

import java.util.Arrays;

public class Quick_Sort {

	public static void main(String[] args) {
		
		int[] a = { 4, 2, 6, 8, 1, 4, 3, 9 };
		System.out.println(Arrays.toString(a));
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));

	}

	public static void sort(int[] a, int st,int end) {
		
		if(st>=end) return ;
		
		int i = st;
		int j = end;
		int pivote = a[(st+end)/2];
		
		while(i<=j) {
			
			while(a[i] < pivote) i++;
			while(a[j] > pivote) j--;
			
			if(i<=j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				i++;
				j--;
			}
		}
		sort(a,st,j);
		sort(a,i,end);
		
	}

}
