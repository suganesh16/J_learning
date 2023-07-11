package hashset;
import java.util.HashSet;
public class HashSetEx10 {   //Write a Java program to compare two hash set.

	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Create the second HashSet
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        // Compare the two HashSets
        boolean areEqual = set1.equals(set2);

        System.out.println("Are the HashSets equal? " + areEqual);

	}

}
