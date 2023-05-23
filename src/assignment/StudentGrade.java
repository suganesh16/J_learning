package assignment;

public class StudentGrade {
	
	public void checkPassOrFail (String name, int studentmarks)
	
	 {
		   if(studentmarks >= 40)
		   {
		  		System.out.println("Pass");
		  }
		  else
		  {
		  	System.out.println("Fail");
		  }
		   System.out.println("Student name is :"+ name + " and the student mark is :"+studentmarks);
	 }
	
	public void checkGrade(int studentmarks) {
	   
		   if (studentmarks>=85)
		   {
		  System.out.println("Grade A");
		   }
		   else if(studentmarks>=70 && studentmarks <85)
		   {
		   System.out.println("Grade B");
		   }
		   else if (studentmarks>=50 && studentmarks <70)
		   {
		System.out.println("Grade C");
		   }
		   else if(studentmarks<50 && studentmarks>40)
		   {
		   System.out.println("Grade D");
		   }
	  else
		   
	   {
	   System.out.println("Student has failed and hence grade is not given");
	   }
}
	public static void main(String[]args) {
	
		StudentGrade s1=new StudentGrade();
		s1.checkPassOrFail("Arun",85);
		s1.checkGrade(85);
		
		StudentGrade s2=new StudentGrade();
		s2.checkPassOrFail("sanjay",75);
		s2.checkGrade(75);
		
		StudentGrade s3=new StudentGrade();
		s3.checkPassOrFail("Kumar", 52);
		s3.checkGrade(52);
		
		StudentGrade s4=new StudentGrade();
		s4.checkPassOrFail("Arun", 43);
		s4.checkGrade(43);
		
		StudentGrade s5=new StudentGrade();
		s5.checkPassOrFail("Ganesh", 23);
		s5.checkGrade(23);
		
		
		
		
		
	}

	
		
	}
	
		
	

