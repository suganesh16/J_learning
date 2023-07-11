package linkedList;
import java.util.LinkedList;
public class LinkedListEx1 { //Write a Java program to append the specified element to the end of a linked list

	public static void main(String[] args) {
		
		 LinkedList<String> linkedList = new LinkedList<>();

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");

	        System.out.println("Before appending: " + linkedList);

	        // Append a new element to the end of the linked list
	        String newElement = "Grapes";
	        linkedList.addLast(newElement);

	        System.out.println("After appending: " + linkedList);

	}

}
