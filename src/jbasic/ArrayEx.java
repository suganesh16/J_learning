package jbasic;

public class ArrayEx {              //Single dimension array

	public static void main(String[] args) {

		int marks=80;
		//Array is used to store the values of similar type in contiguous memory. Array index or subscript will start from 0.
		
		//Array declaration=initliase new array
		
		int marks1[]=new int[8];                     // first way of creating an array
		
		
		marks1[0]=90;     //Adding value to array
		marks1[1]=55;
		marks1[2]=75;
		marks1[3]= 45;
		marks1[4]= 85;
		marks1[5]=67;
		marks1[6]=98;
		marks1[7]=60;
		
		System.out.println(marks1[6]);
		
		//second way of creating the array by adding values directly
		
				int marks2[]= {45, 50, 65, 75};
				
				//third way of creating array 
				
				int[] marks3 = {23,67,89};
				
				System.out.println("Size of an array: "+marks1.length);
				
				
				for (int i=0; i<marks1.length;i++)
				{
					System.out.println(marks1[i]);
				}
				
		
		
	}

}
