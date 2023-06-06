package oops;

class Bikes2
{
	Bikes2()
	{
		System.out.println("Parent constructor");
	}
}
class Bullet1 extends Bikes2
{
	Bullet1()
	{
		System.out.println("child constuctor");
	}
}

public class superConstructorEx {

	public static void main(String[] args) {

		Bullet1 b=new Bullet1();
		
	}

}
