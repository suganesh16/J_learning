package hashset;
import java.util.HashSet;
public class HashSetEx7 {  //Write a Java program to convert a hash set to an array.

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Convert HashSet to an array
        String[] array = set.toArray(new String[set.size()]);

        // Print the array elements
        for (String element : array) {
            System.out.println(element);

		
	}
	}
}
