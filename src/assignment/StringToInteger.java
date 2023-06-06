package assignment;

public class StringToInteger {     //convert string to interger

	public static void main(String[] args) {

		String str="8879";
		String str1="4477";
		int value=Integer.parseInt(str);  //1st method using parseInt
		
		//second method using value of method
		int v=Integer.valueOf(str1);
		
		System.out.println("string to int conversion :"+ value);
		System.out.println("string to int conversion :"+ v);
	}

}
