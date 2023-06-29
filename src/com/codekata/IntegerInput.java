package com.codekata;
import java.util.Scanner;
public class IntegerInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nSample Input:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		System.out.println("\nSample Output:");
		System.out.print(number1 + " " + number2 + " " + number3);
		input.close();
	}

}
