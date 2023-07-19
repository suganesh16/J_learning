package corejava;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap TM =new TreeMap();

		TreeMap<Integer, String> TM1=new TreeMap<Integer, String>();

		//TreeMap TM2=new TreeMap();

		//TreeMap TM3 =new TreeMap(100,(float)0.70);

		TM1.put(101, "John");
		TM1.put(106, null);
		TM1.put(103, "Keny");
		TM1.put(104, "William");
		TM1.put(102, "Smith");
		TM1.put(105, "");
		//TM1.put(null, null);


		System.out.println(TM1);

		System.out.println("===========");
		System.out.println("After remove-->" + TM1.remove(105));

		System.out.println("===========");
		System.out.println(TM1.get(102));

		System.out.println("===========");
		System.out.println(TM1.containsKey(101));
		System.out.println(TM1.containsKey(105));

		System.out.println("===========");
		System.out.println(TM1.containsValue("William"));
		System.out.println(TM1.containsValue("john"));

		System.out.println("===========");
		System.out.println(TM1.isEmpty());
		System.out.println(TM.isEmpty());

		System.out.println("===========");
		System.out.println("Size of LHM1 is---> " + TM1);

		System.out.println("===========");

		System.out.println(TM1.keySet());

		System.out.println("===========");
		System.out.println(TM1.values());

		System.out.println("===========");
		System.out.println(TM1.entrySet());

		System.out.println("===========");
		//for(datatype variablename:collection)

		for(Map.Entry eachEntry :TM1.entrySet())
		{
			System.out.println(eachEntry.getKey()+"----"+eachEntry.getValue());
		}


		Set s= TM1.entrySet();

		Iterator itr= s.iterator();

		while(itr.hasNext())
		{
			Map.Entry entry= (Entry) itr.next();
			System.out.println(entry.getKey()+"-------"+entry.getValue());
		}
	}

}
