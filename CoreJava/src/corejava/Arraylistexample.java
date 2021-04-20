package corejava;

import java.util.ArrayList;

public class Arraylistexample
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a= new ArrayList<String>();
		a.add("Sirisha");
		a.add("Apple");
		a.add("Mango");
		boolean c =a.contains("Sirisha"); //returns tru if present 
		System.out.println(c);
		System.out.println(a.get(2));  //gives string at 2 index
		a.add(0, "Fashh"); // adds string at index 0
		a.set(3, "Hall");  //replaces the string at 3 index with the mentioned string
		System.out.println(a);
		int b=a.size();  //gives size
		a.remove(0);  //removes string at 0
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.indexOf("Hall"));  //give index of certain string
		System.out.println(a.isEmpty());
	}

}
