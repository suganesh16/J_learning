package com.codekata;
import java.util.Scanner;         //beginner 2nd q


public class Multiples {

	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int N = scanner.nextInt();
		scanner.close();

		// Calculate and print the first three multiples
		for (int i = 1; i <= 3; i++) {
			int multiple = N * i;
			System.out.print(multiple + " ");
		}
	}


}


