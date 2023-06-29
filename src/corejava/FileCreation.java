package corejava;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FileCreation {

	public static void main(String[] args) throws IOException {
/*
		System.out.println("Enter path of the file");
		Scanner Sc=new Scanner(System.in);
		
        String path= Sc.nextLine();
		
		System.out.println("Enter the file name");
		Scanner sc1 = new Scanner(System.in);
		
		String fileName= sc1.nextLine();
		
		File f = new File(path+fileName+".txt");
		f.createNewFile();
		*/
		
		
		System.out.println("Enter the path of the file ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String path1 = br.readLine();
		
		System.out.println("Enter the file name");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String fileName1 = br1.readLine();
		
		File f = new File(path1+fileName1+".txt");
		f.createNewFile();
		
	}

}
