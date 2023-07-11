package arraylist;
import java.util.ArrayList;
public class ArrayListEx16 {  //Write a Java program to clone an array list to another array list

	public static void main(String[] args) {

		ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");

        // Clone the ArrayList to another ArrayList
        ArrayList<String> clonedList = new ArrayList<>(originalList);

        // Modify the original ArrayList
        originalList.add("Durian");

        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
	}

}
