package arraylist;
import java.util.ArrayList;

public class ArrayListEx9 {  //Write a Java program to copy one array list into another

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList Numbers1=new ArrayList();
		
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);
        
        Numbers1.addAll(numbers);
        System.out.println("After using addall--->"+Numbers1);
	}

}
