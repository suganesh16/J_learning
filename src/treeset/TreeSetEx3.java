package treeset;
import java.util.TreeSet;
public class TreeSetEx3 {  //Write a Java program to add all the elements of a specified tree set to another tree set.

	public static void main(String[] args) {
		
		 TreeSet<String> set1 = new TreeSet<>();
	        set1.add("Apple");
	        set1.add("Banana");
	        set1.add("Cherry");

	        // Create the second TreeSet
	        TreeSet<String> set2 = new TreeSet<>();
	        set2.add("Mango");
	        set2.add("Pineapple");

	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);

	        // Add all elements of set1 to set2
	        set2.addAll(set1);

	        System.out.println("Set 2 after adding all elements from set1: " + set2);

	}

}
