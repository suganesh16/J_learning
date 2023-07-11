package hashset;
import java.util.HashSet;
import java.util.TreeSet;
public class HashsetEx8 {   //Write a Java program to convert a hash set to a tree set.

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(10);

        // Convert HashSet to TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        // Print the TreeSet
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
	}

}
