package oops;

class Car
{
	String carName="BMW";
	
	void transport()
	{
		System.out.println("Help to transport");
	}
	
}

class BMW extends Car
{
	void luxuary()
	
	{
		System.out.println("Luxuary vechile");
	}
}


public class SingleInheritanceEx {
	
	
	public static void main(String[]args) {
		
		BMW v=new BMW();
		v.transport();
		v.luxuary();
		System.out.println(v.carName);
	}

}
