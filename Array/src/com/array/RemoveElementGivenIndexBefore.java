package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveElementGivenIndexBefore {

	
	static void remove(int[] a,int index) {
		
		HashSet<Integer> hs = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			
			if(i >= index) {
			     
			     hs.add(a[i]);
			}
		}
		System.out.print(hs);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,1,4,6,3,6,7,4};
		System.out.println(Arrays.toString(a));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Index Number :");
		
		int index = sc.nextInt();
		remove(a,index);
		
		
	}

}
