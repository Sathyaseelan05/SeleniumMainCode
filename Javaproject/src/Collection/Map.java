package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

//Map is not a true collection, Since it will the values (key,value) pairs.
//Map is mostly like Set, even it has HashMap, LinkedHashMap, TreeMap.
public class Map {
	
	
	//Duplicate keys are not allowed, Insertion order is not maintained same like hashset.
	public static void EgforHashmap() {
		
		HashMap<String,String> hashmap = new HashMap<String,String>();
		hashmap.put("Name", "Sathya");
		hashmap.put("Gender", "male");
		hashmap.put("Address", "N0:19");
		hashmap.put("City", "Chennai");
		System.out.println(hashmap.size());
		System.out.println(hashmap.get("Name"));
		System.out.println(hashmap.get("City"));
		
	
		
		
		
	}

	//Duplicate keys are not allowed, Insertion order is maintain based on keys
	public static void EgforLinkedHashMap() {
		
		LinkedHashMap<Integer, String> Linkhashmap = new LinkedHashMap<Integer, String>();
		Linkhashmap.put(4, "sathya");
		Linkhashmap.put(3, "sathya");
		Linkhashmap.put(2, "sathya");
		Linkhashmap.put(1, "sathya");
		System.out.println(Linkhashmap.get(4));
		
		System.out.println(Linkhashmap);
	}
	
	
	//Duplicate keys are not allowed, Insertion order is maintained based on the natural sorting order(ASC).
	public static void EgforTreemap() {
		
		TreeMap<Object, Object> treemap = new TreeMap<Object, Object>();
		treemap.put(774164, "seelan");
		treemap.put(8106692, "seelan");
		treemap.put(302, "seelan");
		System.out.println(treemap);
		System.out.println(treemap.get(774164));
		
	}
	
	

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		EgforHashmap();
		EgforLinkedHashMap();
		EgforTreemap();
		 List<String> list = new ArrayList<String>();
	        list.add("Content-Type");
	        list.add("application/json");
	        
	        System.out.println(list);
	        
	        HashMap <String,String> map = new HashMap <String,String>();
	        
	        map.put("Content-type", "application/json");
	        map.put("see", "nature");
	        map.put("admire", "world");
	        map.put("explore", "love");
	        System.out.println(map.get("see"));
	        System.out.println(map.get("admire"));
	        System.out.println(map);
	        

	}

}
