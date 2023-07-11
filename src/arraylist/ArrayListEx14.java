package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx14 {  // Write a Java program that swaps two elements in an array list.

	public static void main(String[] args) {
		 ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);

	        System.out.println("Before swapping: " + numbers);

	        // Swap elements at index 1 and 2
	        Collections.swap(numbers, 1, 2);

	        System.out.println("After swapping: " + numbers);

	}

}
