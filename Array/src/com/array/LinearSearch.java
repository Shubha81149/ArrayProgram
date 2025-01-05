package com.array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] a = {4,5,2,6,7,1};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number what you want to search ?");
		int b = sc.nextInt();
		System.out.println(search(a, b));
		
	}
	public static int search(int[] a,int key) {
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==key) {
				return i;
			}
		}
		return 0;
	}

}
