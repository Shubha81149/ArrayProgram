package com.array;

import java.util.Arrays;

public class ShiftAllzeroToLeft {

	public static void main(String[] args) {
		
		int[] a = {1,0,3,0,6,7};
		int index = a.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				a[index] = a[i];
				index--;
			}
		}
		while(index>=0) {
			a[index]=0;
			index--;
		  
		}
		System.out.println(Arrays.toString(a));
	}

}
