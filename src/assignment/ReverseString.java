package assignment;

public class ReverseString { //how to reverse a string in java without using reverse method

	public static void main(String[] args) {
		
		String name="ganesh";
		String reverse="";
		int slength=name.length();
		System.out.println("length of the string is :"+slength);
		
		for(int i=slength-1;i>=0;i--)
		{
		 reverse=reverse+name.charAt(i);
		  //reverse=""+charAt(6-1)-->(5th position)
		 //reverse=a+(5-1)=4--->n
		 //reverse=an+(4-1)=3-->a
		 //contiues..
		 
		}
			
		System.out.println("reverse string is : "+reverse);		

	}

}
