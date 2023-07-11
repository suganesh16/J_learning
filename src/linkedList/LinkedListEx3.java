package linkedList;
import java.util.LinkedList;
public class LinkedListEx3 { //Write a Java program to remove a specified element from a linked list.

	public static void main(String[] args) {

		 LinkedList<String> linkedList = new LinkedList<>();

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");
	        linkedList.add("Grapes");
	        linkedList.add("Mango");

	        System.out.println("LinkedList is :" + linkedList);
	        // Specify the element to remove
	        String elementToRemove = "Orange";
	        
	        linkedList.remove(elementToRemove);
	        
	        System.out.println("Updated linked list: " + linkedList);

	}

}
