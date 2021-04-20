package corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "PAris");
		hm.put(1, "france");
		System.out.println(hm.get(1));
		hm.put(2, "Belgium");
		hm.put(3, "Italy");
		hm.get(3);
		hm.put(30, "Germany");
		
		System.out.println(hm.get(30));
		hm.remove(30);
		System.out.println(hm.get(30));
		hm.replace(1, "India");
		System.out.println(hm.get(1));
		
		Set sn= hm.entrySet();
		Iterator i= sn.iterator();
		while(i.hasNext())
		{
			Map.Entry mp= (Map.Entry)i.next();
			;
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
