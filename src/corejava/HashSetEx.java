package corejava;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {

		//To store heterogenous data
		HashSet Hs=new HashSet();

		HashSet Hs1=new HashSet();

		//mentioning the memory while creating hashset
		HashSet hs1 = new HashSet(100);

		//Mentioning the memory and the fill ratio
		HashSet hs2 = new HashSet(100,(float)0.90);

		//Homogeneous Hashset
		HashSet<Integer> hs3= new HashSet<Integer>();

		Hs.add(50);
		Hs.add(true);
		Hs.add(null);
		Hs.add("java");
		Hs.add("C++");

		System.out.println(Hs);
		
		
		System.out.println("size of Hs is--->"+Hs.size());

		Hs.remove(null);
		System.out.println("After using remove--->"+Hs);

		System.out.println(Hs.isEmpty());

		System.out.println(Hs.contains("java"));

		System.out.println(Hs1.containsAll(Hs));



		System.out.println("=========================");

		Hs1.addAll(Hs);
		System.out.println("After using addall--->"+Hs1);

		Hs1.add(98);
		System.out.println("After adding 98 Hs1 is"+Hs1);

		Hs1.retainAll(Hs);
		System.out.println("After using retainall--->"+Hs1);

		System.out.println("========================================");
		//for each
		for(Object val:Hs)
		{
			System.out.println(val);
		}
		System.out.println("========================================");
		//Iterator

		Iterator it=Hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());

		}
		System.out.println("========================================");

		Hs1.removeAll(Hs);
		System.out.println("After using removeall---->"+Hs1);

	}

}
