package oops;

class A1{

private int i=10;

 private void display()
 
{
	 System.out.println("Displaying the value of i="+i);
	
}

}

public class privateEx {

	public static void main(String[] args) {
		
	
		A1 obj =new A1();
		
		
		/*
		//compile time error
		System.out.println(obj.i);
		obj.display();
		*/
		
		//Accessing a default method and variable
		B1 obj1 = new B1();
		System.out.println(obj1.a1);
		obj1.displayB1();

		
		

	}

}
