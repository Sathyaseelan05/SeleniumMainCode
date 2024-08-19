package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//name - sathya , seelan , bala, swetha
//id - 1,2,3,4
//area- 13223434

public class CollectionPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap <String,Object> map = new HashMap<String,Object>();
		
		List<Object> name = new ArrayList<Object>();
		name.add("sathya");
		name.add("seelan");
		name.add("swetha");
		
		List<Object> id = new ArrayList<Object>();
		id.add("1");
		id.add("2");
		id.add("3");
		
		List<Object> area = new ArrayList<Object>();
		area.add("sathya");
		area.add("seelan");
		area.add("swetha");
		
		
		
		((HashMap<String, Object>) map).put("name", name);
		((HashMap<String, Object>) map).put("id", id);
		((HashMap<String, Object>) map).put("area", area);
		
		System.out.println(map);
		
		System.out.println(map.get(0));
		
		
		
		
	
		
	

	}

}
