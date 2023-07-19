package corejava;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class LinkedHashMapEx {

	public static void main(String[] args) {

		LinkedHashMap LHM =new LinkedHashMap();

		LinkedHashMap<Integer ,String> LHM1 =new LinkedHashMap<Integer ,String>();

		//LinkedHashMap LHM2 =new LinkedHashMap(100);

		//LinkedHashMap LHM3 =new LinkedHashMap(100,(float)0.90);

		LHM1.put(101, "John");
		LHM1.put(102, "Smith");
		LHM1.put(103, "Keny");
		LHM1.put(104, "William");
		LHM1.put(105, "");
		//LHM1.put(null, null);
		LHM1.put(106, null);

		System.out.println(LHM1);
		System.out.println("===========");

		System.out.println("After remove-->" + LHM1.remove(105));

		System.out.println("===========");
		System.out.println(LHM1.get(102));

		System.out.println("===========");
		System.out.println(LHM1.containsKey(101));
		System.out.println(LHM1.containsKey(105));

		System.out.println("===========");
		System.out.println(LHM1.containsValue("William"));
		System.out.println(LHM1.containsValue(null));

		System.out.println("===========");

		System.out.println(LHM1.isEmpty());
		System.out.println(LHM.isEmpty());

		System.out.println("===========");
		System.out.println("Size of LHM1 is---> " + LHM1);

		System.out.println("===========");

		System.out.println(LHM1.keySet());

		System.out.println("===========");
		System.out.println(LHM1.values());

		System.out.println("===========");
		System.out.println(LHM1.entrySet());

		System.out.println("===========");
		//for(datatype variablename:collection)

		for(Map.Entry eachEntry :LHM1.entrySet())
		{
			System.out.println(eachEntry.getKey()+"----"+eachEntry.getValue());
		}


		Set s= LHM1.entrySet();

		Iterator itr= s.iterator();

		while(itr.hasNext())
		{
			Map.Entry entry= (Entry) itr.next();
			System.out.println(entry.getKey()+"-------"+entry.getValue());
		}

	}

}
