package corejava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHanding {

	public static void main(String[] args) throws IOException  {

		System.out.println("Enter path of the file");
		Scanner Sc=new Scanner(System.in);
		
        String path= Sc.nextLine();
		
		System.out.println("Enter the file name");
		Scanner sc1 = new Scanner(System.in);
		
		String fileName= sc1.nextLine();
		
		File f = new File(path+fileName+".txt");
		f.createNewFile();
		
		FileWriter Fwrite=new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\JLearning\\src\\corejava\\IO");
		
        String writeString="We are learning file operations";
		
		Fwrite.write(writeString);
		
		Fwrite.close();
		
		System.out.println("FileWriting is done successfully");
		    }
		
	

		
	}

