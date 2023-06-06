package oops;

//First we are going to see with difference in the no. of arguments

class Arithematic
{
	int a,b;
	void sub(int a,int b)
	{
		int result=a-b;
		System.out.println("The subtract of 2 nos is"+result);
	}
	


void sub(int a,int b, int c)
{
	int result=a-b-c;
	System.out.println("The subtract of 3 nos is"+result);
}
}

public class methodOverloadingEx1 {

	public static void main(String[] args) {

		Arithematic sb=new Arithematic();
		sb.sub(20,16);
		sb.sub(50,36,12);
		
		
	}

}





//Polymorphism--> many forms
//Under that we have 1. Method Overloading and 2. Method Overriding

//Method overloading or Compile time polymorphism. We use it for better readability of the code
//If a class has same methods name but with  difference in the no. of arguments or data type. Then it is called as method overloading


//1. We should have the same method name but difference in the no. of arguments or data type
//Method overloading will happen in the same class






















