package com.codekata;

import java.util.Scanner; 
public class Factorial {
	public static void main(String[] args) {    //beginer 9
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long factorial = 1;
		for (int i = 1; i <= N; i++) {
			factorial *= i;
		}
		System.out.print(factorial);
		scanner.close();
	}
}
