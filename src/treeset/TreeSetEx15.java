package treeset;
import java.util.TreeSet;
public class TreeSetEx15 { //Java program to retrieve and remove the last element of a tree set

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(1);

        Integer lastElement = treeSet.pollLast();

        if (lastElement != null) {
            System.out.println("Last element: " + lastElement);
            System.out.println("Updated TreeSet: " + treeSet);
        } else {
            System.out.println("The TreeSet is empty.");
        }
	}

}
