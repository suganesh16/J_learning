package treeset;
import java.util.TreeSet;
public class TreeSetEx1 {    

	public static void main(String[] args) {  //Write a Java program to create a tree set, add some colors (strings) and print out the tree set.

		TreeSet<String> treeSet = new TreeSet<>();

        // Add colors to the TreeSet
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");
        treeSet.add("Yellow");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);
	}

}
