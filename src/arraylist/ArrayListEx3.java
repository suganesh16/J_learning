package arraylist;
import java.util.ArrayList;
public class ArrayListEx3 {  //Write a Java program to insert an element into the array list at the first position.

	public static void main(String[] args) {

		 ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");

	        // Insert an element at the first position
	        fruits.add(0, "Mango");

	        // Print out the updated ArrayList
	        System.out.println("Updated ArrayList: "+ fruits  );
	}

}
