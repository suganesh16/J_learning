package corejava;

public class UserDefinedException {
	int age;
	static void Agevalidating(int age)
	{
		
			try {
				if(age<18);
				
				//throw new AgeException();
				throw new AgeException("Age must not be less than 18");
			
			}
			catch (Exception e) {
				
				System.out.println("Inside catch block");
				e.printStackTrace();
			}
			{
				
			}
	}




	public static void main(String[] args) {
		
	
	}
	}




	

class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("Age is greater then 18");
		}
	AgeException(String str)
	{
     System.out.println(str);		
	}
}
