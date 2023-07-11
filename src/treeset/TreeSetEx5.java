package treeset;
import java.util.TreeSet;
public class TreeSetEx5 {  //Write a Java program to get the first and last elements in a tree set.

	public static void main(String[] args) {

		 TreeSet<String> treeSet = new TreeSet<>();

	        treeSet.add("Apple");
	        treeSet.add("Banana");
	        treeSet.add("Cherry");
	        treeSet.add("Durian");
	        treeSet.add("Fig");
	        
	        System.out.println("First Element---> " + treeSet.first());
	        System.out.println("Last Element----> " + treeSet.last());
	}

}
