package hashset;
import java.util.HashSet;
public class HashSetEx3 {   //Write a Java program to get the number of elements in a hash set.

	public static void main(String[] args) {

		 HashSet<String> set = new HashSet<>();

	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");

	        // Get the number of elements in the HashSet
	        int size = set.size();

	        System.out.println("Number of elements in the HashSet: " + size);
	}

}
