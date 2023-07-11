package treeset;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetEx2 {   //Write a Java program to iterate through all elements in a tree set.

	public static void main(String[] args) {

		 TreeSet<String> treeSet = new TreeSet<>();

	        // Add elements to the TreeSet
	        treeSet.add("Red");
	        treeSet.add("Green");
	        treeSet.add("Blue");
	        treeSet.add("Yellow");

	        // Iterate through the elements using an Iterator
	        Iterator<String> iterator = treeSet.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }
	}

}
