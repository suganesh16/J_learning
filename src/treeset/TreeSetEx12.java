package treeset;
import java.util.TreeSet;
public class TreeSetEx12 {  //Write a Java program to get the element in a tree set strictly greater than or equal to the given element

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(1);

        
        int givenElement = 6;

        Integer greaterElement = treeSet.higher(givenElement);

        if (greaterElement != null) {
            System.out.println("Element strictly greater than or equal to " + givenElement + ": " + greaterElement);
        } else {
            System.out.println("No element found strictly greater than or equal to " + givenElement);
        }

	}

}
