package oops;

class cars

{
	String carName="Audi";
	
	void transport()
	
	{
		System.out.println("Help to transport");
	}
}

class Audi extends cars
{
	void luxuary()
	{
		System.out.println("Luxuary vechile");
	}
}

class Benz extends Audi

{
	
	void comforts()
	{
		System.out.println("comforts vechile");
	}
}

public class MultilevelInheritanceEx {

	public static void main(String[] args) {

		Benz b=new Benz();
		b.comforts();
		b.luxuary();
		b.transport();
		System.out.println(b.carName);
		
	}

}
