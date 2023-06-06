package assignment;

public class stringToArray {

	public static void main(String[] args) {

		 String inputString = "Java";
	        char[] charArray = new char[inputString.length()];

	        // Write string characters into the array
	        for (int i = 0; i < inputString.length(); i++) {
	            charArray[i] = inputString.charAt(i);
	        }

	        // Print the array elements
	        System.out.println("Array contents:");
	        for (char c : charArray) {
	            System.out.print(c + " ");
	        }
	}

}
