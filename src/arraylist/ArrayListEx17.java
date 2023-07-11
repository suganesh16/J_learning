package arraylist;
import java.util.ArrayList;

public class ArrayListEx17 {    //Write a Java program to empty an array list

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Before emptying: " + list);

        // Empty the ArrayList
        list.clear();

        System.out.println("After emptying: " + list);
	}

}
