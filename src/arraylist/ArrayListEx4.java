package arraylist;
import java.util.ArrayList;

public class ArrayListEx4 {  //Write a Java program to retrieve an element (at a specified index) from a given array list.

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Retrieve an element at a specified index
        int index = 2; // Index of the element to retrieve
        String element = colors.get(index);
        System.out.println("Element at index " + index + ": " + element);
	}

}
