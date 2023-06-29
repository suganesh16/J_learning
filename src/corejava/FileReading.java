package corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {

		File f =new File("C:\\Users\\Admin\\eclipse-workspace\\JLearning\\src\\corejava\\IO");
		
		
		//using Scanner class
		
		Scanner Sc=new Scanner(f);
		
		System.out.println(Sc.nextLine());
		
		
		/*
		 * Using BufferedReader Class
		 * 
		 
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String str;
		while( (str=br.readLine()) != null)
		{
			System.out.println(str);
		}
		*/
		
		
	}

}
