package com.codekata;

import java.util.Scanner;

public class MinimumNumber {        //maths  1

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Read the 10 numbers
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the minimum number
        int minimum = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        // Print the minimum number
        System.out.println(minimum);

        scanner.close();
	}

}
