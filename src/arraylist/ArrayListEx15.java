package arraylist;
import java.util.ArrayList;
public class ArrayListEx15 {   //Write a Java program to join two array lists

	public static void main(String[] args) {

		 ArrayList<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        ArrayList<Integer> list2 = new ArrayList<>();
	        list2.add(4);
	        list2.add(5);
	        list2.add(6);

	        // Create a new ArrayList to store the joined lists
	        ArrayList<Integer> joinedList = new ArrayList<>();

	        // Add all elements from list1
	        joinedList.addAll(list1);

	        // Add all elements from list2
	        joinedList.addAll(list2);

	        System.out.println("Joined List: " + joinedList);
	}

}
