package oops;

class cars1
{
	void transport()
	{
		System.out.println("Help to transport");
	}
}

class Audi1 extends cars1
{
	void luxuary()
	
	{
		System.out.println("luxuary vechile");
	}
}
class Benz1 extends cars1
{
	void comforts()
	{
		System.out.println("comfort vechile");
	}
}

public class HirearchicalInheritanceEx {

	public static void main(String[] args) {

		Benz1 b = new Benz1();
		b.comforts();
		b.transport();
		
		
		Audi1 a= new Audi1();
		a.luxuary();
		a.transport();
		
	}

}
