package hashset;
import java.util.HashSet;
import java.util.TreeSet;
public class HashSetEx9 {   //Write a Java program to find numbers less than 7 in a tree set.

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);

        // Find numbers less than 7
        TreeSet<Integer> numbersLessThan7 = new TreeSet<>();
        for (Integer number : treeSet) {
            if (number < 7) {
                numbersLessThan7.add(number);
            }
        }

        // Print the numbers less than 7
        System.out.println("Numbers less than 7: " + numbersLessThan7);
		

	}

}
