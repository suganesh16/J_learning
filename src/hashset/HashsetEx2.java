package hashset;
import java.util.HashSet;
import java.util.Iterator;
public class HashsetEx2 {   //Write a Java program to iterate through all elements in a hash list

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Iterate through the elements using an Iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
	}

}
}
