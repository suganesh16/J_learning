package com.codekata;

import java.util.Scanner;  //beginer 3rd
public class OddEven {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=scanner.nextInt();
		scanner.close();

		int roundedNumber = (int) Math.round(number);

		if (roundedNumber == 0) {
			System.out.println("Zero");
		}

		else if (roundedNumber % 2 == 0) {
			System.out.println("Even");
		}

		else {
			System.out.println("Odd");
		}
	}
}
