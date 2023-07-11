package treeset;
import java.util.TreeSet;
public class TreeSetEx7 {  //Write a Java program to get the number of elements in a tree set

	public static void main(String[] args) {

		 TreeSet<String> treeSet = new TreeSet<>();

	        treeSet.add("Apple");
	        treeSet.add("Banana");
	        treeSet.add("Cherry");

	        // Get the number of elements in the TreeSet
	        int size = treeSet.size();

	        System.out.println("Number of elements in the TreeSet: " + size);
	}

}
