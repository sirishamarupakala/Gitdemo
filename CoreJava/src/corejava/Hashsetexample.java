package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		hs.add("Rahul");
		hs.add("Rakesh");
		hs.add("Ramesh");
		hs.add("Suresh");
		hs.add("hareesh");
		hs.add("mahesh");
		
		System.out.println(hs);
		hs.remove("Rakesh");
		System.out.println(hs);
		System.out.println(hs.size());
			
		Iterator<String> i= hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		
	}

}
