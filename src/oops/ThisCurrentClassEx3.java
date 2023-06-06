package oops;
//local variable are variables declared inside the methods or constructor
//instance variables are variables that are declared inside the class but outside of all the methods. Moreover instance variables have default values assigned.
//With instance variables, you can specify different access modifiers like public, private, protected and default


//If we use different variable names for both instance and local variables, then there is no need to use this keyword
class Student3
{
	//instance variables
	int rollNo1;
	String name1;
	int marks1;
	
	Student3(int roll, String name, int marks)
	{
		rollNo1= roll; //16
		name1 = name; //yash
		marks1=marks; //85
	}
	
	void displayStudentData() {
		System.out.println("The Student rollno is "+rollNo1+" and his name and marks are "+name1+" "+marks1);

	}
}

public class ThisCurrentClassEx3 {

	public static void main(String[] args) {
		
		Student3 obj = new Student3(16,"yash",85);
		obj.displayStudentData();
		
		
	}

}


