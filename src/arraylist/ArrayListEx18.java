package arraylist;
import java.util.ArrayList;

public class ArrayListEx18 { //Write a Java program to test whether an array list is empty or not.

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        boolean isEmpty = arrayList.isEmpty();

        if (isEmpty) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

	}

}
