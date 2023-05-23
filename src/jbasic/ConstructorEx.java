package jbasic;

public class ConstructorEx {
	
	int id;
	String name;
	int Rollno;
	
	public ConstructorEx(int i,String n,int s) {
		id=i;
		name=n;
		Rollno=s;
		
	}
	public void display()
	{
	System.out.println("The id of the student is "+id+" and the name is "+name+" and Rollno is "+Rollno);	 
	
	}
	public static void main(String[] args)
	{
		ConstructorEx s1 = new ConstructorEx(1011,"Arun",11);
		s1.display();
		
		ConstructorEx s2=new ConstructorEx(1012,"Kumar",12);
		s2.display();
		
	}

}
