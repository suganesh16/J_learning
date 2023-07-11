package corejava;
import java.util.Arrays;
import java.util.ArrayList;

public class IntegerArrayToList {

	public static void main(String[] args) {

		//first way

		Integer Ar[]= {10,20,30,40,50};

		ArrayList val = new ArrayList(Arrays.asList(Ar));
		System.out.println(val);

		//second way

		int[] Ar1= {1,2,3,4,5};

		ArrayList v= new ArrayList();

		for(int value:Ar1)
		{
			v.add(value);
		}

		System.out.println(v);

	}

}
