package corejava;
import java.util.*;

public class JoinedArrayListEx {

	public static void main(String[] args) {

		List<Integer> list1= new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println("List 1 values are " + list1);
		
		List<Integer> list2= new ArrayList<>();
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println("list 2 values are" + list2);
		
		List<Integer> Joinedlist= new ArrayList<>();
		
		System.out.println("Before adding list" + Joinedlist);
		Joinedlist.addAll(list1);
		
		Joinedlist.addAll(list2);
		
		System.out.println("After adding list--> " + Joinedlist);
		
		
		
		
	}

}
