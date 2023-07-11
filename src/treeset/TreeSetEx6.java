package treeset;
import java.util.TreeSet;

public class TreeSetEx6 {  //Write a Java program to clone a tree set list to another tree set.

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Durian");
       
        
        TreeSet<String> clonedSet = new TreeSet<>(treeSet);
        
        treeSet.add("Fig");
        
        System.out.println("treeSet: " + treeSet);
        System.out.println("Cloned Set: " + clonedSet);

	}

}
