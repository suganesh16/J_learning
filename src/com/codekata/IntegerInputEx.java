package com.codekata;
import java.util.Scanner;
public class IntegerInputEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.println("You entered " + number);
		input.close();
	}
}



