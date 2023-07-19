package corejava;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapEx {

	public static void main(String[] args) {

		//	//heterogenous data
		HashMap HM=new HashMap();
		
		//homogeneous data
		HashMap<Integer, String> HM1=new HashMap<Integer, String>();
		
		//hashmap using capacity
		//HashMap HM2=new HashMap(90);
		
		//hashmap using capacity and ratio
		//HashMap HM3=new HashMap(90,(float).70);
		
		HM1.put(101, "John");
		HM1.put(102, "Smith");
		HM1.put(103, "Keny");
		HM1.put(null, "Y");
		HM1.put(104, null);
		
		System.out.println(HM1);
		
		HM.remove(104);
		System.out.println("After removing-->"+HM1);
		
		System.out.println(HM1.get(101));
		
		System.out.println(HM1.containsKey(102));
		System.out.println(HM1.containsKey(105));
		
		System.out.println(HM1.containsValue("John"));
		System.out.println(HM1.containsValue(""));
		
		System.out.println(HM.isEmpty());
		System.out.println(HM1.isEmpty());
		
		System.out.println(HM1.size());
		
		System.out.println(HM1.keySet());
		
		System.out.println(HM1.values());
		
		System.out.println(HM1.entrySet());
		
		//for(datatype variablename:collection)
		
				for(Map.Entry eachEntry :HM1.entrySet())
				{
					System.out.println(eachEntry.getKey()+"----"+eachEntry.getValue());
				}
				

		Set s= HM1.entrySet();
		
		Iterator itr= s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry= (Entry) itr.next();
			System.out.println(entry.getKey()+"-------"+entry.getValue());
		}

		
		
		
		
		
	}

}
