package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx11 {  //Write a Java program to reverse elements in an array list

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Reverse the elements in the ArrayList
        Collections.reverse(colors);

        // Print out the reversed ArrayList
        System.out.println("Reversed ArrayList: " + colors);

	}

}
