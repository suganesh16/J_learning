package assignment;

public class OccurChar {// how to count the occurence of the given character in string

	public static void main(String[] args) {

		String st="hello"; //input string
		
		//character for which occurence should be calculated
		 char c='l';
		 int count=0;
		 for(int i=0;i<st.length();i++)
		 {
			 if(st.charAt(i)==c) {
				 count++;
				 
			 }
		 }
		
		System.out.println("The character "+c+" has repeated "+count+ " times");
		
		
		
	}

}
