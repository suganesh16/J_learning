package oops;


//multiple inheritance
//why it is supported in java. Here the compiler will confuse which sleep() to call


//multiple inheritance --> able to inherit 2 classes at a time which is not possible in java
class A
{
	void sleep()
	{
		System.out.println("Sleep method in A class");
	}
}

class B
{
	void sleep()
	{
		System.out.println("Sleep method in B class");
	}
}


public class MultipleInheritanceEx {

	public static void main(String[] args) {

	}

}
