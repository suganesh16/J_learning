package hashset;
import java.util.HashSet;
public class HashSetEx11 {   //Write a Java program to compare two hash set

	public static void main(String[] args) {

		HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        System.out.println(set1.contains(set2));
	}

}
