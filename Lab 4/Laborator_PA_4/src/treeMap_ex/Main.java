package treeMap_ex;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(01,"A");
		tm.put(03, "B");
		tm.put(02, "C");
		
		System.out.println("Inainte de stergere: ");
		for(Map.Entry m:tm.entrySet()){
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		
		
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		
		hm.put(10, "X");
		hm.put(12, "Y");
		hm.put(11, "Z");
		
		System.out.println("Inainte de stergere: ");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		
		tm.remove(03);
		
		System.out.println("Dupa stergere: ");
		for(Map.Entry m:tm.entrySet()){
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		
		hm.remove(12);
		
		System.out.println("Dupa stergere: ");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+ " " +m.getValue());
		}
	}

}
