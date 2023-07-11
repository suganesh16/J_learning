package hashset;
import java.util.HashSet;
public class HashSetEx13 {  //Write a Java program to remove all elements from a hash set.

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("Before removing: " + set);

        set.clear();

        System.out.println("After removing: " + set);
	}

}
