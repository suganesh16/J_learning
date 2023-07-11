package hashset;
import java.util.HashSet;
public class HashSetEx4 {  //Write a Java program to empty an hash set.

	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<>();

	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");

	        System.out.println("Before emptying: " + set);

	        // Empty the HashSet
	        set.clear();

	        System.out.println("After emptying: " + set);

		
	}

}
