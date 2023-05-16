package assignment;

public class Factiorial {

	public static void main(String[] args) {
/*
		//3!=3*2*1 =6
				//4!=4*3*2*1=24
				
				int factorialNumber=5; //5! = 5*4*3*2*1
				int factorialResult=1;
				
				for(int i=1;i<=factorialNumber;i++)
				{
					factorialResult= factorialResult*i;
					//1=1*1
					//2=1*2
					//6=2*3
					//24=6*4
					//120 =24*5
				}
				System.out.println("Factorial of "+factorialNumber+" is: "+factorialResult);
				
			}
	
			*/
		
		
		
		int factorialNumber=8;
		int factorialResult=2;
		
		for(int j=2;j<=factorialNumber;j++)   //8! =8*7*6*5*4*3*2*1
		{
			factorialResult= factorialResult*j;
			//2=2*1
			//4=2*2
			//12=4*3
			//48=12*4
			//240=48*5
			//1440=240*6
			//10080=1440*7
			//80640=10080*8
			
		}
		System.out.println("Factorial of "+factorialNumber+" is: "+factorialResult);	
	}
}


