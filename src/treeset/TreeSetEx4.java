package treeset;
import java.util.TreeSet;
public class TreeSetEx4 {  // Write a Java program to create a reverse order view of the elements contained in a given tree set.

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);

        // Create a reverse order view using descendingSet()
        TreeSet<Integer> reverseSet = (TreeSet<Integer>) treeSet.descendingSet();

        // Print the reverse order view
        System.out.println("Original TreeSet: " + treeSet);
        System.out.println("Reverse Order View: " + reverseSet);
	}

}
