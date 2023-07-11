package linkedList;
import java.util.LinkedList;
public class LinkedListEx5 { //write a Java program to remove all elements from a linked list.

	public static void main(String[] args) {
		 LinkedList<String> linkedList = new LinkedList<>();

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");
	        linkedList.add("Grapes");
	        linkedList.add("Mango");

	        System.out.println("Linked list before removal: " + linkedList);

	        // Remove all elements from the linked list
	        linkedList.clear();

	        System.out.println("Linked list after removal: " + linkedList);

	}

}
