package oops;

public class protectedEx {
	
	protected int a2=25;
	protected void displayA2()
	{
		System.out.println("The value of A2 is "+a2);
	}

	public static void main(String[] args) {
		
		protectedEx obj= new protectedEx();
		System.out.println("The value of a2->"+obj.a2);
		obj.displayA2();

		
		
	}

}
