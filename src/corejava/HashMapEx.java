package corejava;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapEx {

	public static void main(String[] args) {

		//	//heterogenous data
		HashMap HM=new HashMap();
		
		//homogeneous data
		HashMap<Integer, String> HM1=new HashMap<Integer, String>();
		
		//hashmap using capacity
		HashMap HM2=new HashMap(90);
		
		//hashmap using capacity and ratio
		HashMap HM3=new HashMap(90,(float).70);
		
		HM.put(101, "John");
		HM.put(102, "Smith");
		HM.put(103, "Keny");
		HM.put(null, "Y");
		HM.put(104, null);
		
		System.out.println(HM);
		
		HM.remove(104);
		System.out.println("After removing-->"+HM);
		
		System.out.println(HM.get(101));
		
		System.out.println(HM.containsKey(102));
		System.out.println(HM.containsKey(105));
		
		System.out.println(HM.containsValue("John"));
		System.out.println(HM.containsValue(""));
		
		System.out.println(HM.isEmpty());
		System.out.println(HM1.isEmpty());
		
		System.out.println(HM.size());
		
		System.out.println(HM.keySet());
		
		System.out.println(HM.values());
		
		System.out.println(HM.entrySet());
		
		//for(datatype variablename:collection)
		/*
				for(Map.Entry eachEntry :HM.entrySet())
				{
					System.out.println(eachEntry.getKey()+"----"+eachEntry.getValue());
				}*/
				

		Set s= HM.entrySet();
		
		Iterator itr= s.iterator();
		
		while(itr.hasNext())
		{
			//Map.Entry entry= (Entry) itr.next();
			//System.out.println(entry.getKey()+"-------"+entry.getValue());
		}

		
		
		
		
		
	}

}
