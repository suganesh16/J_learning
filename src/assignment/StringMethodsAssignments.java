package assignment;

public class StringMethodsAssignments {

	public static void main(String[] args) {

		
		String s0= "Learning";
		
		//concat(string s0)
		s0=s0.concat(" basic in java");
		System.out.println(s0);
		
		//to upper case
		String s1=s0.toUpperCase();
		System.out.println(s1);
		
		//to lower case
		String s2=s1.toLowerCase();
		System.out.println(s2);
		
		//charAt(int index)
		char s3=s2.charAt(6);
		System.out.println(s3);
		
		//replace(char oldChar, char newChar)
		String s4=s0.replace("b","B");
		System.out.println(s4);
		
		//replace(char oldChar, char newChar)
		String s5=s0.replace("in","at");
		System.out.println(s5);
		
		//contains(s0)
		boolean s6=s0.contains("in");
		System.out.println(s6);
		
		//contains(s0)
		boolean s7=s0.contains("at");
		System.out.println(s7);
		
		//
		String s8="";
		boolean emptyString= s8.isEmpty();
		System.out.println(emptyString);
		
		String s9="hello";
		String s10="Hello";
		
		boolean equalString= s9.equals(s10);
		System.out.println("Equals-->"+equalString);
		
		boolean equalIgnoresString= s9.equalsIgnoreCase(s10);
		System.out.println("Equals Ignores case-->"+equalIgnoresString);
		
		String s11= s0.substring(1, 11);
		System.out.println("Substring-->"+s11);
		
		String s12= s0.substring(1);
		System.out.println("Substring without end index-->"+s12);
		
		int lengthOfString= s0.length();
		System.out.println(lengthOfString);
		
		int ch1=s0.indexOf("o");
		System.out.println("Index of -->"+ch1);
		
		String s13=s0.trim();
		System.out.println("Trimed string" + s13);
		
		boolean s14=s0.startsWith("learning");
		System.out.println(s14);
		
		boolean s15=s0.endsWith("java");
		System.out.println(s15);
		
		String[] s16=s0.split("-");
		System.out.println(s16);
		
		
		
		
		
		
		
	}

}
