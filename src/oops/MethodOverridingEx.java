package oops;

//For method overriding same method name is used (intrest) where else given logic is changed (i.e  sysout)
//used Hirearchical inheritance concept every child class  extends to parent class

class Bank
{
	void intrest()
	{
		System.out.println("Bank intrest is 7 %");
	}
}
	
	class HDFC extends Bank
	{
		void intrest()
		{
			System.out.println("HDFC bank intrest is 8 %");
		}
	}
	class ICICI extends Bank
	{
		void intrest()
		{
			System.out.println("ICICI bank intrest is 9 %");
		}
	}
		
		class Axis extends Bank
		{
			void intrest()
			{
				System.out.println("Axis bank intrest is 11 %");
			}
	
}
	

public class MethodOverridingEx {

	public static void main(String[] args) {

		HDFC hd=new  HDFC();
		hd.intrest();
		
		ICICI IC=new ICICI();
		IC.intrest();
		
		Axis ax=new Axis();
		ax.intrest();
		
		Bank B=new Bank();
		B.intrest();
		
		
		
	}

}
