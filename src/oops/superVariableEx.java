package oops;

//super can be used to refer immediate parent class instance variable.

//baseclass or super class
class Bikes
{
	String bikecolour="blue";
	
	
}

class pulsar extends Bikes
{
	String bikecolour="black";
	void displaycolour()
	{
		System.out.println("The bike color in the child class is-->"+bikecolour);
		System.out.println("The bike color in the super class is -->"+super.bikecolour);
	}
}


public class superVariableEx {

	public static void main(String[] args) {
		
		pulsar bk=new pulsar();
		bk.displaycolour();
		

	}

}
