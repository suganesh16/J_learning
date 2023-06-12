package oops;

// extends two interface 
//by using implement keyword extends the two interface
interface lorry5
{
	void fc();
	
}

interface lorry6 extends lorry5
{
	void paint();
	
}

public class ExtendsTwoInterfaceEx implements lorry5,lorry6{
	
	@Override
	public void paint() {
    System.out.println("painting work");		
	}

	@Override
	public void fc() {
    System.out.println("show fc ");		
	}
	

	public static void main(String[] args) {
		
		ExtendsTwoInterfaceEx obj=new ExtendsTwoInterfaceEx();
		obj.fc();
		obj.paint();

	}

	

}
