package jbasic;

public class StringExample {

	public static void main(String[] args) {
		
		//First way of creating of Strings (String literal)

		String s1="Java";
		String s2="Java";
		
		/* values would be stored in different memory locations in heap memory but for string, 
		 * if the values are same then it will allocate to a single memory location
		int a=10;
		int b=10;
		
		*/
		
		//second way of creating strings
		//str is the object which would in the heap memory but its value would be String pool memory and 
		//java would make the necessary memory mapping for it
		
		String str= new String("Hello");
		
		
		// to explain string immutability (Once the value is assigned to a string object,  its value cannot be changed)
		
		String str1 = new String("Hello");
		String str2=str1.concat("world");
		System.out.println(str1);
		System.out.println(str2);

		
		
	}

}
