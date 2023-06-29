package com.codekata;
import java.util.Scanner;

public class NumberExit {

	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the values of N and K
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        // Read the elements of the list
        int[] elements = new int[N];
        for (int i = 0; i < N; i++) {
            elements[i] = scanner.nextInt();
        }
        
        // Check if K exists in the list
        boolean exists = false;
        for (int i = 0; i < N; i++) {
            if (elements[i] == K) {
                exists = true;
                break;
            }
        }
        
        // Print 'yes' or 'no' based on existence of K
        if (exists) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        // Close the scanner
        scanner.close();
	}

}
