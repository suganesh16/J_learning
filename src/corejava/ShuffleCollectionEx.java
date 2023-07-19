package corejava;
import java.util.*;

public class ShuffleCollectionEx {

	public static void main(String[] args) {

		List<String> collection= new ArrayList<>();
		
		collection.add("cars");
		collection.add("bus");
		collection.add("lorry");
		collection.add("truck");
		collection.add("tractor");
		
		System.out.println("Before shuffle---> " + collection);
		
		Collections.shuffle(collection);
		
		System.out.println("After shuffle----> " + collection);
		
	}

}
