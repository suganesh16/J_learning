package com.codekata;
import java.util.Scanner;

public class EqualiteralTriangle {    //beginer 4

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//System.out.print("Enter the side length of the equilateral triangle: ");
		double side = scanner.nextDouble();
		scanner.close();

		double area = (Math.sqrt(3) / 4) * side * side;

		area = Math.round(area * 100.0) / 100.0;

		System.out.print( area);
	}

}
