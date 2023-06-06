package oops;

//Method overloading with the different data type

class sub{
	
	int a,b;
	void sub(int a,int b)
	{
		
		int result=a-b;
		System.out.println("the subtract of 2 nos is "+ result);
		}
	
	void sub(double c, double d)
	{
		double result= c-d;
		System.out.println("The addition of 3 double  nos is "+result);

	}
	
}

public class methodOverloadingEx2 {

	public static void main(String[] args) {

		sub sb=new sub();
		sb.sub(38,12);
		sb.sub(36.5,12.3);
		
	}

}
