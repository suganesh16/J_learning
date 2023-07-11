package hashset;
import java.util.HashSet;

public class HashSetEx1 {   //Write a Java program to append the specified element to the end of a hash set

	public static void main(String[] args) {

		 HashSet<String> set = new HashSet<>();

	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");

	        System.out.println("HashSet before appending: " + set);

	        // Append an element to the HashSet
	        set.add("Durian");

	        System.out.println("HashSet after appending: " + set);
	}

}
