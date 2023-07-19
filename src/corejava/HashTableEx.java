package corejava;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {

		Hashtable Ht = new Hashtable();

		Hashtable<Integer, String> Ht1 =new Hashtable<Integer, String>();



		Ht1.put(101, "John");
		Ht1.put(102, "Smith");
		Ht1.put(103, "Keny");
		//Ht1.put(104, null);
		Ht1.put(105, "x");

		System.out.println(Ht1);

		Ht1.remove(105);
		System.out.println("After remove ---> " + Ht1);

		System.out.println("=============");
		System.out.println(Ht1.get(101));

		System.out.println("==============");
		System.out.println(Ht1.containsKey(102));
		System.out.println(Ht1.containsKey(104));

		System.out.println("=============");
		System.out.println(Ht1.contains("Smith"));
		System.out.println(Ht1.contains(""));

		System.out.println("==============");
		System.out.println(Ht.isEmpty());
		System.out.println(Ht1.isEmpty());

		System.out.println("================");
		System.out.println("size of Ht1 is --> " + Ht1.size());

		System.out.println("================");
		System.out.println(Ht1.keySet());

		System.out.println("================");
		System.out.println(Ht1.values());

		System.out.println("================");
		System.out.println(Ht1.entrySet());


		System.out.println("================");
		//for(datatype variablename:collection)

		for(Map.Entry eachEntry :Ht1.entrySet())
		{
			System.out.println(eachEntry.getKey()+"----"+eachEntry.getValue());
		}


		Set s= Ht1.entrySet();

		Iterator itr= s.iterator();

		while(itr.hasNext())
		{
			Map.Entry entry= (Entry) itr.next();
			System.out.println(entry.getKey()+"-------"+entry.getValue());
		}

	}

}
