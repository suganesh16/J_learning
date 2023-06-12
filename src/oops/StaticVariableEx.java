package oops;

//Here vehicleName and price are instance variables and its value is dependent on the objects we create for that class
//whereas vehicleType is static variable which means that its value is unique for all the complete class irrespective of the objects we create for the class
//We can access a static variable using classname.variablename (because static variable are class level variables)

// We can call a static variable or a method using its classname( syntax—> classname.varaiablename)

class Vechiledetails
{
	String vechileName;
	int vechileprice;
	 static String vechileType;
	
	void displayvechiledata()
	{
		System.out.println(vechileName+":"+vechileprice+":"+vechileType);
	}
}


public class StaticVariableEx {

	public static void main(String[] args) {

		Vechiledetails obj1 = new Vechiledetails();
		obj1.vechileName="Bullet";
		obj1.vechileprice=1450000;
		//obj1.vehicleType="2 Wheeler";
		
	
		
		Vechiledetails obj2 = new Vechiledetails();
		obj2.vechileName="Honda Amaze";
		obj2.vechileprice=9850000;
		//obj2.vehicleType="4 Wheeler";
		Vechiledetails.vechileType="6 wheeler";
		
		
		//VehicleDetails.vehicleType="6 wheeler";
		
		obj1.displayvechiledata();
		
		obj2.displayvechiledata();
		
		
		
	}

}
