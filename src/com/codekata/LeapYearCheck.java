package com.codekata;
import java.util.Scanner;


public class LeapYearCheck {        //beginer 10

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        // Checking if it's a leap year
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // Output
        if (isLeapYear) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

	}

}
