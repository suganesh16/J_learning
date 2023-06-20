package corejava;

public class NumberFormatExceptionEx {//UserdefinedExceptionMessage

	public static void main(String[] args) {

		try
		{
		
			String str="abc";
			System.out.println(Integer.parseInt(str));
		}
		catch(Exception ex)
		{
			System.out.println("User defined exception message--> Number format exception");
			System.out.println(ex);
	
		}
	}

}
