package corejava;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3 };
        int result = numbers[4]; // Throws ArrayIndexOutOfBoundsException
        System.out.println("Result: " + result);
	}

}
