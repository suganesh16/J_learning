package oops;

class B1
{
	int a1=78;
	void displayB1()
	{
		System.out.println("The value of B1 is "+a1);
	}
}



public class defaultEX {

	public static void main(String[] args) {
		
		B1 obj= new B1();
		System.out.println(obj.a1);
		obj.displayB1();


	}

}
