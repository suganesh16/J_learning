package assignment;

public class SwapString {

	public static void main(String[] args) {

		String str1 = "Java ", str2 = "Language";    
		
        System.out.println("Strings before swapping: " + str1 + " " + str2);    
       
        String temp=str1;
          str1=str2;
          str2=temp;
          
       
       System.out.println("Strings after swapping: " + str1 + " " + str2);    
	}

}
