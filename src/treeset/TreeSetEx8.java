package treeset;
import java.util.TreeSet;
public class TreeSetEx8 {  //Write a Java program to compare two tree sets

	public static void main(String[] args) {

		TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        // Add elements to the first TreeSet
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to the second TreeSet
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Compare the two TreeSets
        boolean isEqual = set1.equals(set2);

        // Display the result
        if (isEqual) {
            System.out.println("The TreeSets are equal.");
        } else {
            System.out.println("The TreeSets are not equal.");
        }
	}

}
