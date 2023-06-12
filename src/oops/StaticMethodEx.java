package oops;

class Vechiledetails1
{
	String vechileName;
	int vechileprice;
	 static String vechileType;
	
	void displayvechiledata()
	{
		System.out.println(vechileName+":"+vechileprice+":"+vechileType);
	}


//static method can have only static members inside it and thats the reason vehicleName and price are displaying error

	//compiler would get confused to which instance of the variable is called and thats the reason non-static or instance variables are not allowed inside a static method
	static void displayData1(Vechiledetails1 obj1)
	{
		System.out.println("inside static method");

		System.out.println(obj1.vechileName+":"+obj1.vechileprice+":"+vechileType);
		System.out.println(vechileType);

	}
}

public class StaticMethodEx {

	public static void main(String[] args) {
		
		Vechiledetails1 obj1 = new Vechiledetails1();
		obj1.vechileName="Bullet";
		obj1.vechileprice=1450000;
		obj1.vechileType="2 Wheeler";
		
	
		
		Vechiledetails obj2 = new Vechiledetails();
		obj2.vechileName="Honda Amaze";
		obj2.vechileprice=9850000;
		obj2.vechileType="4 Wheeler";
		
		
		//accessing a static variable
		Vechiledetails.vechileType="6 wheeler";
				
				obj1.displayvechiledata();
				
				obj2.displayvechiledata();
				
				//accessing a static method
				Vechiledetails1.displayData1(obj1);
	}
}








