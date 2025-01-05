package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class AscChar {

	public static void main(String[] args) {
		
		char[] ch = {'d','a','f','j','j','a'};
		
		Arrays.sort(ch);
		
		HashSet<Character> ach = new LinkedHashSet<Character>();
		
		for(char c:ch) {
			ach.add(c);
		}
		
		System.out.println(ach);

	}

}
