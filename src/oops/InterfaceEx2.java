package oops;

interface RBI
{
	void rateofintrest();
	
}

class SBI implements RBI
{
	
@Override
public void rateofintrest() {
	System.out.println("Rate of intrest is 9%");
	
}
}
class BOI implements RBI
{

	@Override
	public void rateofintrest() {
  System.out.println("Rate of intrest is 11%");		
	}
	
}

class BankofBaroda implements RBI
{

	@Override
	public void rateofintrest() {
     System.out.println("Rate of intrest is 12%");		
	}
	
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		
		
		SBI sb=new SBI();
		sb.rateofintrest();
		
		BOI B=new BOI();
		B.rateofintrest();
		
		BankofBaroda ax=new BankofBaroda();
		ax.rateofintrest();
		
		
		
		
		
		
		

	}

}

