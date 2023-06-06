package oops;

//When we add final keyword to the method, then that method cannot be overrided in the subclass

class computer
{
	final void Ostypes()
	{
		System.out.println("The os type is window");
	}
}

public class FinalMethodEx  extends computer{
	
	//void Ostypes()
	{
		System.out.println("The os type is linux");
	}

	public static void main(String[] args) {

		FinalMethodEx os=new FinalMethodEx();
		os.Ostypes();
		
		
	}

}
