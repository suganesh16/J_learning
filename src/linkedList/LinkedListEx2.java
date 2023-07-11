package linkedList;
import java.util.LinkedList;
public class LinkedListEx2 { //Write a Java program to iterate through all elements in a linked list.

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Iterate through all elements in the linked list
        System.out.println("Elements in the linked list:");
        for (String element : linkedList) {
            System.out.println(element);
        }

	}

}
