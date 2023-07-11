package corejava;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {

		LinkedList A1=new LinkedList();
		
		A1.add("A");
		A1.add("1");
		A1.add(null);
		A1.add("B");
		A1.add("2");
		
		System.out.println("Before using methods " +A1);
		
		A1.addFirst("CC");
		System.out.println("After using addfirst "+A1);
		
		A1.addLast("MM");
		System.out.println("After using addlast"+A1);
		
		A1.removeFirst();
		System.out.println("After removing first element"+A1);
		
		A1.removeLast();
		System.out.println("After removing last element"+A1);
		
		
		System.out.println("After using getfirst ----> "+ A1.getFirst());
		
		System.out.println("After using getlast ----> "+ A1.getLast());
		
		
		
	}

}
