package com.array;

import java.util.Arrays;

public class ShiftAllzerosToRight {

	public static void main(String[] args) {
		
		int[] a = {1,0,2,0,3,4,0,5};
		int index = 0;
		for(int i=0;i<a.length;i++) {
		   if(a[i]!=0) {
			   a[index]=a[i];
			   index++;
		   }
		}
		while(index<a.length) {
			a[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(a));
	}

}
