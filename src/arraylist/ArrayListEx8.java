package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx8 {  //Write a Java program to sort a given array list

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);

        // Sort the ArrayList
        Collections.sort(numbers);

        // Print out the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);
		
	}

}
