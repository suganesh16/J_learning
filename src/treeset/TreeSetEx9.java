package treeset;
import java.util.TreeSet;

public class TreeSetEx9 {   //Write a Java program to find numbers less than 7 in a tree set

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(1);

        // Find numbers less than 7
        TreeSet<Integer> lessThanSeven = new TreeSet<>();
        for (Integer num : treeSet) {
            if (num < 7) {
                lessThanSeven.add(num);
            }
        }

        // Print the numbers less than 7
        System.out.println("Numbers less than 7: " + lessThanSeven);

		
	}

}
