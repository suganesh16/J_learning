package com.codekata;
import java.util.Scanner;
public class VovelCheck {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

       
        int N = scanner.nextInt();

        
        String[] strings = new String[N];

        // Read the N strings
        for (int i = 0; i < N; i++) {
            strings[i] = scanner.next();
        }

        // Check if all strings have at least one vowel
        boolean allHaveVowel = true;
        for (String str : strings) {
            if (!containsVowel(str)) {
                allHaveVowel = false;
                break;
            }
        }

        // Print the result
        if (allHaveVowel) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // Close the scanner
        scanner.close();
    }

	private static boolean containsVowel(String str) {
		return false;
	}
	}


