package treeset;
import java.util.TreeSet;
public class TreeSetEx13 {  //Write a Java program to get an element in a tree set that has a lower value than the given element

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(1);

        
        int givenElement = 6;

        Integer greaterElement = treeSet.lower(givenElement);

        if (greaterElement != null) {
            System.out.println("Element lower than or equal to " + givenElement + ": " + greaterElement);
        } else {
            System.out.println("No element found lower than or equal to " + givenElement);
        }

	}

}
