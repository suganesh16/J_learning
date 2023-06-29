package com.codekata;

import java.util.Scanner;
public class ArrayInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nSample Input:");
		int size = input.nextInt();
		int k = input.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("\nSample Output:");
		System.out.println(size + " " + k);
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		input.close();
	}
}
