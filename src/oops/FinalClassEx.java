package oops;

//If we declare a class ad final, we cannot inherit that specific class 

final class laptop
{
	void Ostype()
	{
		System.out.println("The os type is window");
	}
}

public class FinalClassEx  {

	public static void main(String[] args) {
		
		laptop c= new laptop();
		c.Ostype();
		
		

	}

}
