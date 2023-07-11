package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx10 {  //Write a Java program to shuffle elements in an array list.

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Shuffle the elements in the ArrayList
        Collections.shuffle(colors);

        // Print out the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + colors);
	}

}
