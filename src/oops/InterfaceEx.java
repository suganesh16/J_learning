package oops;


/*
 * Syntax for creating an interface
 * 
interface interfaceName
{
	
}
*/

interface BikeDetails
{
	void gear();
	void acclerate();
}


public class InterfaceEx implements BikeDetails{
	
	@Override
	public void gear() {
			System.out.println("Changing the gear");			
	}
	

	@Override
	public void acclerate() {
		// TODO Auto-generated method stub
		System.out.println("Accelerate the bike");
		
	}

	public static void main(String[] args) {
		
		InterfaceEx obj= new InterfaceEx();
		obj.gear();
		obj.acclerate();

	}

}
