package com.codekata;

import java.util.Scanner;     //beginer 7
public class SeriesNthTerm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int nthTerm = N * N;
		System.out.print(nthTerm);
		scanner.close();
	}
}
