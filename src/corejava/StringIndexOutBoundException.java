package corejava;

public class StringIndexOutBoundException {

	public static void main(String[] args) {

		 String str = "Hello, World!";
	        char character = str.charAt(20); // Throws StringIndexOutOfBoundsException
	        System.out.println("Character: " + character);
	}

}
