package hashset;
import java.util.HashSet;
public class HashSetEx5 {   //Write a Java program to test if a hash set is empty or not

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("Apple");
		System.out.println("test if a hash set is empty or not " + set.isEmpty());
	}

}
