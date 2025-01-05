package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] a = {3,6,7,9,10,25,60};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number you want to Search ?");
		int b = sc.nextInt();
		System.out.println(search(a, b, 0, a.length-1));
	}
	
	public static int search(int[]a,int key,int st,int end) {
	
		if(st>end) return -1;
		int mid = (st+end)/2;
		
		if(a[mid]==key) return mid;
		if (a[mid]>key) return search(a,key,st,mid-1);
		
		return search(a,key,mid+1,end);
		
	}

}
