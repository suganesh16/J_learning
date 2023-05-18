package jbasic;

public class ClassDemo {
	

	int num=145;
	public void addTwoNumbers(int a,int b) //method calling
	{
		int result=a+b;                  // action to perform
		System.out.println("Adding 2 nos"+result);
		
	}

	public static void main(String[] args) {

		
		{ 
			//classname object = new classname(); syntax for object creation
			
			
			ClassDemo obj1= new ClassDemo();    
			System.out.println(obj1.num);
			obj1.addTwoNumbers(178, 84);
			
			ClassDemo obj2 = new ClassDemo();
			System.out.println(obj2.num);
			obj2.addTwoNumbers(234, 92);

		
	}

}

	
		
	}

