package oops;

//We are going to see how to solve multiple inheritance problem through interface

interface lorry3
{
	void lorrybreak();
	
}

interface lorry4
{
	void lorrybreak();
	
}


public class MultipleInheritanceInterface2 implements lorry3,lorry4 {
	
	@Override
	public void lorrybreak() {
    System.out.println("Appling lorry break");		
	}
	

	public static void main(String[] args) {

		MultipleInheritanceInterface2 MI =new MultipleInheritanceInterface2();
		MI.lorrybreak();
		
	}

	

}
