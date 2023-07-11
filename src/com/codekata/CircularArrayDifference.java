package com.codekata;
import java.util.Scanner;

public class CircularArrayDifference {       //array 1

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate and print the results
        int[] result = calculateDifference(n, m, arr);
        for (int res : result) {
            System.out.print(res + " ");
        }

        scanner.close();
    }

    public static int[] calculateDifference(int n, int m, int[] arr) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - arr[(i + 1) % n]);
            if (diff > m) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
	}

}
