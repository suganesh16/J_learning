package hashset;
import java.util.HashSet;
public class HashSetEx6 {   //Write a Java program to clone a hash set to another hash set

	public static void main(String[] args) {
		
		HashSet<String> Set = new HashSet<>();

        Set.add("Apple");
        Set.add("Banana");
        Set.add("Cherry");

        // Clone the HashSet to another HashSet
        HashSet<String> clonedSet = new HashSet<>(Set);

        // Modify the original HashSet
        Set.add("Durian");

        System.out.println("Original Set: " + Set);
        System.out.println("Cloned Set: " + clonedSet);

		
	}

}
