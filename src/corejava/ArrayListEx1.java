package corejava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList<String> A1= new ArrayList<String>();
		
		ArrayList<String> A2= new ArrayList<String>();
		
		System.out.println("Before adding in Arraylist A2"+A2);
		
		
		A1.add("A");
		A1.add("V");
		A1.add("N");
		A1.add("K");
		A1.add("T");
		
		A2.addAll(A1);
		System.out.println("After adding in Arraylist A2"+A2);
		
		A2.removeAll(A1);
		System.out.println("After deleting values from A2-->"+A2);
		
		//we dont have predefined methods in arraylist, we can use the predefined methods in Collections class to sort, shuffle
		Collections.sort(A1);
		System.out.println("After sorting-->"+A1);
		
		Collections.sort(A1,Collections.reverseOrder());
		System.out.println("Sorting in reverse order-->"+A1);//[Y, X, C, B, A]
		
		Collections.shuffle(A1);
		System.out.println("After shuffling-->"+A1);
		
		
			
		}
		
	}


