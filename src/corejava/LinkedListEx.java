package corejava;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListEx {

	public static void main(String[] args) {

		//LinkedList with heterogenous data
		LinkedList A1=new LinkedList();
		
		//LinkedList with homogeneous data
		LinkedList<String> A2=new LinkedList<String>();
		
		
		LinkedList A3=new LinkedList();
		
		A1.add("JAVA");
		A1.add(null);
		A1.add("45");
		A1.add("67.5");
		A1.add("true");
		
		System.out.println("After adding Linkedlist"+A1);
		
		System.out.println(A1.size());
		
		A1.remove(1);
		System.out.println("After removing element from index 1-->"+A1);
		
		A1.add(2, "C++");
		System.out.println("After adding element at index 2-->"+A1);
		
		//A1.get(2);
		System.out.println("After using get element at index 2-->"+A1.get(2));
		
		A1.set(1, "python");
		System.out.println("After replacing the value at index 1-->"+A1);
		
		//A1.contains("C++");
		System.out.println(A1.contains("C++"));
		
		System.out.println(A1.isEmpty()); 
		System.out.println(A1.isEmpty());
		
		
		System.out.println("================");
		
		//First way to iterate over a collection
		
		for(int i=0;i<A1.size();i++)
		{
			System.out.println(A1.get(i));
		}
		
		System.out.println("=========================");
		
		//second way for iterating over a collection
		for(Object data:A1)
		{
			System.out.println(data);
		}
		
		System.out.println("=========================");
		
		//Iterator
		Iterator it = A1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("=====================");
		
		A2.addAll(A1);
		System.out.println("After adding in Arraylist A2"+A2);
		
		A2.removeAll(A1);
		System.out.println("After deleting values from A2-->"+A2);
		
		
		Collections.sort(A1);
		System.out.println("After sorting-->"+A1);
		
		Collections.sort(A1,Collections.reverseOrder());
		System.out.println("Sorting in reverse order-->"+A1);
		
		Collections.shuffle(A1);
		System.out.println("After shuffling-->"+A1);
		
	}

}
