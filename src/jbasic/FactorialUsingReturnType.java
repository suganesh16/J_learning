package jbasic;

public class FactorialUsingReturnType {
	
	public int factorial(int factorialNumber)
	{
		int factorialResult=1;
		for(int i=1;i<=factorialNumber;i++)
		{
			factorialResult= factorialResult*i;
		}
		System.out.println("Factorial of a number: "+factorialNumber+" is "+factorialResult);
		return factorialResult;
		
	}
	
	
	public static void main(String args[])
	{
		FactorialUsingReturnType obj1= new FactorialUsingReturnType();
		int result=obj1.factorial(9);
		System.out.println("The factorial value is "+result);
		
		FactorialUsingReturnType obj2= new FactorialUsingReturnType();
		int result1=obj2.factorial(11);
		System.out.println("The factorial value is "+result1);


		
	}

}



