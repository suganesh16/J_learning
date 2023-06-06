package assignment;

import java.util.Arrays;

public class AnagramEx {   // how to check if two string are anagram of each other

	public static void main(String[] args) {

		String s1="knee";
		String s2="keen";
		
		char[] c=s1.toLowerCase().toCharArray();
		System.out.println(c);
		Arrays.sort(c);
		
		
		char[] c1=s2.toLowerCase().toCharArray();
		System.out.println(Arrays.equals(c, c1));
		Arrays.sort(c1);
		
	}

}
