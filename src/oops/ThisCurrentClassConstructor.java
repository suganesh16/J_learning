package oops;

class mahindra

{
	mahindra()
	{
		System.out.println("This is default constructor");
	}
	mahindra(String name)
	{
		//this();
		System.out.println("The car name is "+name);
	}

}
	
	


public class ThisCurrentClassConstructor {

	public static void main(String[] args) {

		mahindra obj = new mahindra("Mahindra XUV 700");
		
	}

}
