package hashset;
import java.util.HashSet;
import java.util.Set;
public class HashSetEx12 {   //Write a Java program to compare two sets and retain elements that are the same

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Retain elements that are common to both sets
        Set<Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);

        System.out.println("Common Elements: " + commonElements);
	}

}
