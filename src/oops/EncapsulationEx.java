package oops;

class Employeedetails
{
	private String EmployeeName;
	private int Employeeage;
	
	
	public void setEmployeeName(String Name) {
		EmployeeName = Name;
	}
	
	
	public void setAge(int age) {
		Employeeage = age;
	}
	
	public String getEmployeeName() {
		return EmployeeName;
	}
	public int getAge() {
		return Employeeage;
	}
	
	
	
}

public class EncapsulationEx {

	public static void main(String[] args) {

		Employeedetails emp=new Employeedetails();
		emp.setEmployeeName("balu");
		emp.setAge(27);
		
		System.out.println(emp.getEmployeeName());
	    System.out.println(emp.getAge());
	}

}
