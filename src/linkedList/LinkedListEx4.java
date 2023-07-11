package linkedList;
import java.util.LinkedList;
public class LinkedListEx4 {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("Mango");

        // Remove the first element from the linked list
        String firstElement = linkedList.removeFirst();
        System.out.println("First element " + firstElement + " removed");

        // Remove the last element from the linked list
        String lastElement = linkedList.removeLast();
        System.out.println("Last element  " + lastElement +  " removed.");

        System.out.println("Updated linked list: " + linkedList);
	}

}
