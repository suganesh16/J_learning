package corejava;

public class TryCatchEx {

	public static void main(String[] args) {

		//syntax for try catch
		
		/*
		 * try
		 * {
		 *		code which will throw exception
		 * }
		 * catch(Exception ex)
		 * {	
		 * 	thrown exception would be caught here
		 * 
		 * }
		 */
		
		int a,b,c;
		a=20;
		b=0;
		try
		{
			c=a/b;
			
		}
		catch(ArithmeticException A)
		{
			System.out.println(A);
		}
		System.out.println("Outside of try catch block");

		
	}

}
