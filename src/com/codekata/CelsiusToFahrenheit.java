package com.codekata;

import java.util.Scanner;      //beginer 8
public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double celsius = scanner.nextDouble();
		scanner.close();
		double fahrenheit = (celsius * 9 / 5) + 32;
		fahrenheit = Math.round(fahrenheit * 100.0) / 100.0;
		System.out.print(fahrenheit);
	}
}
