package com.codekata;

import java.util.Scanner;

public class CircleCirumference {              //beginer 6

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
		double circumference = 2 * Math.PI * radius;
		circumference = Math.round(circumference * 100.0) / 100.0;
		System.out.println(circumference);
		scanner.close();
	}
}
