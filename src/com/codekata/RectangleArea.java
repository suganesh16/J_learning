package com.codekata;

import java.util.Scanner;

public class RectangleArea {   //beginer 5

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int breadth = scanner.nextInt();
		int area = length * breadth;
		System.out.print(area);
		scanner.close();

	}

}
