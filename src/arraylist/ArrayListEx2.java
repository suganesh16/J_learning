package arraylist;
import java.util.ArrayList;

public class ArrayListEx2 {  //2. Write a Java program to iterate through all elements in an array list.

	public static void main(String[] args) {

		 ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        // Iterate through the ArrayList using a for-each loop
	       
	        for (int number : numbers) {
	            System.out.println(number);
	        }
             System.out.println("====================");
	        // Iterate through the ArrayList using a traditional for loop
	      	        for (int i = 0; i < numbers.size(); i++) {
	            int number = numbers.get(i);
	            System.out.println(number);
	        }
	}

}
