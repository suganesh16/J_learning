package corejava;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {

		//to accept heterogenous values
		ArrayList a1=new ArrayList();
		
		
		ArrayList a2=new ArrayList();
		
		//Arraylist to add only String values
				ArrayList<String> A1= new ArrayList<String>();
				
				//Arraylist to add only integer values
				ArrayList<Integer> A2 = new ArrayList<Integer>();
		

				// 4th way of creating ArrayList
				List A4 = new ArrayList();
				
				a1.add("Java");
				a1.add(1);
				a1.add(14.5);
				a1.add('c');
				a1.add(true);
				
				System.out.println(a1);
				
				System.out.println(a1.size());
				
				a1.remove(1);
				System.out.println("After removing element from index 1-->"+a1);
				
				a1.add(2, "C++");
				System.out.println("After adding element at index 2-->"+a1);
				
				
				a1.get(0);
				System.out.println("After using get element at index 0-->"+a1);
				
				a1.set(1, "python");
				System.out.println("After replacing the value at index 1-->"+a1);
				
				a1.contains("C++");
				System.out.println(a1.contains("pascal"));
				
				System.out.println(a1.isEmpty()); 
				System.out.println(a1.isEmpty());
				
				
				//First way to iterate over a collection
				
				for(int i=0;i<a1.size();i++)
				{
					System.out.println(a1.get(i));
				}
				
				System.out.println("=========================");
				
				//second way for iterating over a collection
				for(Object data:a1)
				{
					System.out.println(data);
				}
				
				System.out.println("=========================");
				//Iterator
				Iterator it = a1.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}

				
				a2.add("java");
				a2.add("programming");
				a2.add("language");
				
				a1.addAll(a2);
				System.out.println("After addall operation"+a2);
				
				a1.removeAll(a2);
				System.out.println("After removeall operation"+a1);
				
				a1.add("java");
				a1.add("learning");
				
				a1.retainAll(a2);
				System.out.println("After retainAll operation:" +a1);
				
				
				
				
				
				
	}

}
