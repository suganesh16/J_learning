package arraylist;
import java.util.ArrayList;

public class ArrayListEx1 {   //1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

	public static void main(String[] args) {

		 ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");
	        
	        System.out.println(colors);
	}

}
