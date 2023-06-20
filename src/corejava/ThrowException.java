package corejava;

public class ThrowException {

	public static void main(String[] args) throws Exception {

		//ThrowExample.throwEx(16);
		throwEx.throwEx(15);
		
	}

}

class ThrowExample
{
	int age;
	static void throwEx(int age) throws Exception
	{
		if(age<18);
		
		throw new Exception ("Age must be greater then 18");	
	}
}

class throwEx
{                // by using throw keyword we can give any type of exception(user defined exception)
int age;
	
	static void throwEx(int age)
	{
		if(age <= 18)
		{
			//throw object or instance of the exception class
			//throw new ArithmeticException
			throw new NumberFormatException("Age must be greater than 18");
		}
		else
		{
			System.out.println("Age is greater than 18");
		}
		
	}
	
}
