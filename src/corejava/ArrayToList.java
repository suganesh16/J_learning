package corejava;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayToList {

	public static void main(String[] args) {

		String ar[]= {"Apple,Orange,Grapes"};

		ArrayList A1=new ArrayList(Arrays.asList(ar));

		System.out.println(A1);

		Iterator itr= A1.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
