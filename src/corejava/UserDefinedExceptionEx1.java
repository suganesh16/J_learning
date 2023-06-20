package corejava;

public class UserDefinedExceptionEx1 {
	
	int mark;
	static void MarkValidation(int mark)
	{
		try
		{
			if(mark<40);
			{
				throw new MarkValidation();
				//throw new MarkValidation("Student mark should not less 40");
				
			}
			
		}
		catch(Exception Ex)
		{
			System.out.println("Inside catch block");
			Ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		MarkValidation(30);

	}

}

class MarkValidation extends Exception
{
	MarkValidation()
	{
		System.out.println("Student Mark should be greater then 40");
	}
	
	MarkValidation(String str)
	{
		System.out.println(str);
	}
}
