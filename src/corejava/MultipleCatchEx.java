package corejava;

public class MultipleCatchEx {

	public static void main(String[] args) {

		//we can use multiple catch to find which exception is present but only one try should  used 
		//in this program there two exception is given but only execute which execption is present
		
		try
		{
			String s=null;
			System.out.println(s.charAt(3));
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		//if we don't know what exception is present simply give exception in catch area
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}

		
	}

}
