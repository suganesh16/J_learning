package jbasic;

public class FactorialUsingClass {
	public void factorial(long factorialNumbers)
	{
		long factorialResult=1;
		for(long i=1;i<=factorialNumbers;i++)
		{
			factorialResult= factorialResult*i;
		}
		System.out.println("Factorial of a number: "+factorialNumbers+" is "+factorialResult);
		
	}
	public static void main(String[] args) {
		
		FactorialUsingClass obj1= new FactorialUsingClass();
		obj1.factorial(18);
		
		
		FactorialUsingClass obj2= new FactorialUsingClass();
		obj2.factorial(46);
		
	}
		
	}
	


