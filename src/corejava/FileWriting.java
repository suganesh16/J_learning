package corejava;

import java.io.*;

public class FileWriting {

	public static void main(String[] args) throws IOException {

		FileWriter Fwrite=new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\JLearning\\src\\corejava\\IO");
		
         String writeString="We are learning file operations";
		
		Fwrite.write(writeString);
		
		Fwrite.close();
		
		System.out.println("FileWriting is done successfully");
	}

	
		
	}


///BufferedWriter

/*
		BufferedWriter brWriter= new BufferedWriter(new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\JLearning\\src\\corejava\\IO"));
		
		String str="Writing using Bufferred WRiter";
		brWriter.write(str);
		
		brWriter.close();
		
		System.out.println("File writing successful");

*/


