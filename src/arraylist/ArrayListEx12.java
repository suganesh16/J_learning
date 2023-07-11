package arraylist;
import java.util.ArrayList;
public class ArrayListEx12 {

	public static void main(String[] args) {   //Write a Java program to extract a portion of an array list.

		 ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Extract a portion of the ArrayList
	        int fromIndex = 1; // Starting index 
	        int toIndex = 4; // Ending index
	        
            ArrayList<String> extractedPortion = new ArrayList<>(colors.subList(fromIndex, toIndex));
            System.out.println("Extracted Portion: " + extractedPortion);

	}

}
