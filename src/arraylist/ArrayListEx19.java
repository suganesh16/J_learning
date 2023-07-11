package arraylist;
import java.util.ArrayList;

public class ArrayListEx19 {  //Write a Java program for trimming the capacity of an array list.

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Trim the capacity of the ArrayList
        trimCapacity(arrayList);

        // Print the result
        System.out.println("Trimmed ArrayList: " + arrayList);
	}

    private static void trimCapacity(ArrayList<Integer> list) {
        ArrayList<Integer> trimmedList = new ArrayList<>(list);
        list.clear();
        list.addAll(trimmedList);
	}

}
