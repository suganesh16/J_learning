package com.codekata;

import java.util.Scanner;
public class IntegerList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String inputLine = scanner.nextLine();
			System.out.println(inputLine);
		}
		scanner.close();
	}
	}
