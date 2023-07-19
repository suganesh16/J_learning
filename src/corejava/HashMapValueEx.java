package corejava;
import java.util.*;

public class HashMapValueEx {

	public static void main(String[] args) {
		
		HashMap<String ,Integer> Hm= new HashMap<>();
		Hm.put("cars", 10);
		Hm.put("lorry", 20);
		Hm.put("bus", 30);
		Hm.put("truck", 40);
		Hm.put("tractor", 50);
		
		System.out.println(Hm);
		
		Collection<Integer> values = Hm.values();
		
		System.out.println(values);
		

	}

}
