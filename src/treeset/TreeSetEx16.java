package treeset;
import java.util.TreeSet;
public class TreeSetEx16 {  //write a Java program to remove a given element from a tree set.


	public static void main(String[] args) {

		 TreeSet<Integer> treeSet = new TreeSet<>();

	        treeSet.add(2);
	        treeSet.add(7);
	        treeSet.add(4);
	        treeSet.add(5);
	        treeSet.add(9);
	        treeSet.add(1);

	        int givenElement = 7;

	        boolean removed = treeSet.remove(givenElement);

	        if (removed) {
	            System.out.println(givenElement + " removed successfully.");
	            System.out.println("Updated TreeSet: " + treeSet);
	        } else {
	            System.out.println(givenElement + " not found in the TreeSet.");
	        }
	}

}
