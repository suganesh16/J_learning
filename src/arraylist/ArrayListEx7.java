package arraylist;
import java.util.ArrayList;
public class ArrayListEx7 {  //Write a Java program to search for an element in an array list.

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        
       System.out.println(colors.contains("Green"));
	}

}
