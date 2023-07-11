package corejava;
import java.util.LinkedList;
public class LinkedListEx2 {

	public static void main(String[] args) {
		
		LinkedList LL=new LinkedList();
		LL.add("A");
		LL.add("C");
		LL.add("B");
		LL.add("E");
		LL.offer("D");
		LL.offer("C");
		LL.offer(true);
		 
		 
		 
		
		System.out.println(LL);
		
		//to fetch the head element . //A //It will throw NoSuchElement Exception
		System.out.println(LL.element());
		
		//System.out.println(LL.peek());//A //It will throw Null
		
		//It will throw NoSuchElement Exception
		//System.out.println(LL.remove());
		//System.out.println(LL);
		
		
		//It will return Null
		//System.out.println(LL.poll());
		//System.out.println(LL);
	}

}
