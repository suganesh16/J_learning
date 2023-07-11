package com.codekata;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FinestNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int z = scanner.nextInt();

        // Read the array of numbers
        int[] numbers = new int[z];
        for (int i = 0; i < z; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the finest numbers
        List<Integer> finestNumbers = findFinestNumbers(numbers);

        // Print the finest numbers in ascending order
        if (finestNumbers.isEmpty()) {
            System.out.println(-1);
        } else {
            finestNumbers.sort(null);
            for (int num : finestNumbers) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    public static List<Integer> findFinestNumbers(int[] numbers) {
        List<Integer> finestNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int t = (int) Math.cbrt(numbers[i]); // Cube root of the number

            // Check if the number is formed by t^3 + (t+1)^3
            if (numbers[i] == Math.pow(t, 3) + Math.pow(t + 1, 3)) {
                finestNumbers.add(numbers[i]);
            }
        }
        return finestNumbers;

	}

}
