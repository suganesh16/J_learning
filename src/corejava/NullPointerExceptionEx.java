package corejava;

public class NullPointerExceptionEx {

	public static void main(String[] args) {

		try
		{
			String s=null;
			System.out.println(s.charAt(2));
		}
		/*
		catch(NullPointerException ex)
		{
			System.out.println(ex);
		}
		*/
		
		//we dont know what exception is occur for that we use exception in catch(exception)
		//or else we know what exception is that we declare it in the catch(NullPointerException)
		//here ex is the object that we creation for the exception
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
