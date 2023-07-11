package arraylist;
import java.util.ArrayList;

public class ArrayListEx6 {  //Write a Java program to remove the third element from an array list.

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Remove the third element
        int index = 2; // Index of the element to remove
        String removedElement = colors.remove(index);
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated ArrayList: " + colors);
	}

}
