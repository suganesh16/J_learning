package oops;

class cycle
{
	void chain()
	{
		System.out.println("check the chain spoket");
	}
	
	void peddle()
	{
		this.chain();
		
		System.out.println("check the peddles");
	}
}

public class ThisCurrentClassMethods {

	public static void main(String[] args) {

		cycle cy=new cycle();
		cy.chain();
		//cy.peddle();
	}

}
