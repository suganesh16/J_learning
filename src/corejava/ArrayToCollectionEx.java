package corejava;

import java.util.Arrays;
import java.util.List;

public class ArrayToCollectionEx {

	public static void main(String[] args) {
		String[] array = {"cars,bus,lorry"};
		
		List<String> list =Arrays.asList(array);
		
		

		System.out.println(list);
	}

}
