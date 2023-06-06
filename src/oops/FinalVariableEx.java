package oops;

/*
 * Java Final keyword is used to restrict the user and it can be used along with Variables, methods and classes
 */

//When i have declared a variable as final, i cannot change its value


public class FinalVariableEx {
	
	final int Rollno=15;
	
	void dispalyRollno()
	{
		//Rollno=87;
		System.out.println("The roll no is "+Rollno);
	 
		
	}

	public static void main(String[] args) {

		FinalVariableEx f=new FinalVariableEx();
		f.dispalyRollno();
	}

}
