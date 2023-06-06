package oops;

//super can be used to invoke immediate parent class method.


//super class
class Bikes1
{
	String bikecolour="black";
	void display()
	{
		System.out.println("The bike colour in super class  is "+ bikecolour);
	}
}

//child class
class Bullet extends Bikes1
{
	String bikecolour="Green";
	void display()
	{
		System.out.println("The bike colour in child class is "+ bikecolour);
}
	void getallbikedata()
	{
		display();
		super.display();
	}
}

public class superMethodEx {

	public static void main(String[] args) {
		Bullet b =new Bullet();
		b.getallbikedata();
		

	}

}
