package assignment;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		String str[]= {"Java", "is ", "my ","favorite","programming","language"};
		
		//sing toString
		String str1= Arrays.toString(str);
		System.out.println(str1);
		
		//join method
		String str2= String.join(" ", str);
		System.out.println(str2);
	}

}
