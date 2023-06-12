package oops;

//We are going to see how to solve multiple inheritance problem through interface


interface lorry1
{
	String lorrybrand="Tata";
	void brand();
			
}

interface lorry2
{
	void engine();
}


public class MultipleInheritanceInterfaceEx1 implements lorry1,lorry2{
	

	@Override
	public void engine() {
     System.out.println("Engine cc is 2000rpm");		
	}

	@Override
	public void brand() {
     System.out.println("Lorry brand is "+lorrybrand);		
	}
	

	public static void main(String[] args) {

		
		MultipleInheritanceInterfaceEx1 M=new MultipleInheritanceInterfaceEx1();
		M.brand();
		M.engine();
	}


}
