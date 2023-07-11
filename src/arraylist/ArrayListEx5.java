package arraylist;
import java.util.ArrayList;
public class ArrayListEx5 {  //Write a Java program to update an array element by the given element.

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        
        String updatedElement = "white";
        int index=2;
        colors.set(index, updatedElement);
        System.out.println("Updated ArrayList: " + colors);
	}

}
